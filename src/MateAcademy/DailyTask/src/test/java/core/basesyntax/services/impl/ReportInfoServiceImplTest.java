package MateAcademy.DailyTask.src.test.java.core.basesyntax.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import core.basesyntax.db.Storage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReportInfoServiceImplTest {
    private static ReportInfoServiceImpl reportInfoService;
    private static final String TITLE = "fruit,quantity";
    private static final String BANANA = "banana";
    private static final String BANANA_WITH_POSITIVE_VALUE = "banana,152";
    private static final String BANANA_WITH_NEGATIVE_VALUE = "banana,-50";
    private static final String BANANA_WITH_ZERO_VALUE = "banana,0";
    private static final String APPLE = "apple";
    private static final String APPLE_100_VALUE = "apple,100";
    private static final String APPLE_90_VALUE = "apple,90";
    private static final int ZERO = 0;
    private static final int NEGATIVE_VALUE = -50;

    @BeforeEach
    void setUp() {
        reportInfoService = new ReportInfoServiceImpl();
    }

    @AfterEach
    void tearDown() {
        Storage.fruits.clear();
    }

    @Test
    void reportInfo_ValidData_ok() {
        Storage.fruits.put(BANANA, 152);
        Storage.fruits.put(APPLE, 90);
        String expected = TITLE + System.lineSeparator()
                + BANANA_WITH_POSITIVE_VALUE + System.lineSeparator()
                + APPLE_90_VALUE + System.lineSeparator();
        String actual = reportInfoService.createReportInfo();
        assertEquals(expected, actual);
    }

    @Test
    void reportInfo_fromEmptyStorage_ok() {
        String expected = TITLE + System.lineSeparator();
        String actual = reportInfoService.createReportInfo();
        assertEquals(expected, actual);
    }

    @Test
    void reportInfo_fruitWithZeroQuantit_ok() {
        Storage.fruits.put(BANANA, ZERO);
        Storage.fruits.put(APPLE, 100);
        String expected = TITLE + System.lineSeparator()
                + BANANA_WITH_ZERO_VALUE + System.lineSeparator()
                + APPLE_100_VALUE + System.lineSeparator();
        String actual = reportInfoService.createReportInfo();
        assertEquals(expected, actual);
    }

    @Test
    void reportInfo_fruitsWithNegativeQuantity_ok() {
        Storage.fruits.put(BANANA, NEGATIVE_VALUE);
        Storage.fruits.put(APPLE, 100);
        String expected = TITLE + System.lineSeparator()
                + BANANA_WITH_NEGATIVE_VALUE + System.lineSeparator()
                + APPLE_100_VALUE + System.lineSeparator();
        String actual = reportInfoService.createReportInfo();
        assertEquals(expected, actual);
    }
}

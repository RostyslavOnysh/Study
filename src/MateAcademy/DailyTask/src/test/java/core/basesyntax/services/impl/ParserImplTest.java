package MateAcademy.DailyTask.src.test.java.core.basesyntax.services.impl;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import core.basesyntax.model.FruitTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ParserImplTest {
    private static ParserImpl parserImpl;
    private static final String APPLE = "apple";
    private static final String BANANA = "banana";
    private static final String ORANGE = "orange";
    private static final String TITLE = "type,fruit,quantity,";
    private static final List<String> VALUE_LIST = List.of(TITLE,
            "b,banana,20,",
            "b,apple,100,",
            "s,banana,100,",
            "p,banana,13,",
            "r,apple,10,",
            "p,apple,109,",
            "p,banana,155,",
            "s,banana,50");

    @BeforeAll
    static void beforeAll() {
        parserImpl = new ParserImpl();
    }

    @Test
    void parseReport_ValidReport_Ok() {
        List<FruitTransaction> expected = List.of(new FruitTransaction(
                        FruitTransaction.Operation.BALANCE, BANANA, 20),
                new FruitTransaction(FruitTransaction.Operation.BALANCE, APPLE, 100),
                new FruitTransaction(FruitTransaction.Operation.SUPPLY, BANANA, 100),
                new FruitTransaction(FruitTransaction.Operation.PURCHASE, BANANA, 13),
                new FruitTransaction(FruitTransaction.Operation.RETURN, APPLE, 10),
                new FruitTransaction(FruitTransaction.Operation.PURCHASE, APPLE, 109),
                new FruitTransaction(FruitTransaction.Operation.PURCHASE, BANANA, 155),
                new FruitTransaction(FruitTransaction.Operation.SUPPLY, BANANA, 50));
        List<FruitTransaction> actual = parserImpl.parser(VALUE_LIST);
        assertIterableEquals(expected, actual);
    }

    @Test
    void parseWith_validInput_ok() {
        List<String> validList = Arrays.asList(TITLE,
                "b,apple,5",
                "s,banana,10",
                "p,orange,3"
        );
        List<FruitTransaction> expectedTransactions = new ArrayList<>();
        expectedTransactions.add(new FruitTransaction(
                FruitTransaction.Operation.BALANCE, APPLE, 5));
        expectedTransactions.add(new FruitTransaction(
                FruitTransaction.Operation.SUPPLY, BANANA, 10));
        expectedTransactions.add(new FruitTransaction(
                FruitTransaction.Operation.PURCHASE, ORANGE, 3));
        List<FruitTransaction> actualTransactions = parserImpl.parser(validList);
        Assertions.assertEquals(expectedTransactions, actualTransactions);

    }

    @Test
    void parseWith_invalidInput_notOk() {
        List<String> invalidList = Arrays.asList(TITLE,
                "f,Apple,5",
                "s,Banana,10");
        assertThrows(IllegalArgumentException.class, () -> parserImpl.parser(invalidList));
    }

    @Test
    void parseReport_EmptyList_ok() {
        List<String> empty = Collections.emptyList();
        List<FruitTransaction> expected = Collections.emptyList();
        List<FruitTransaction> actual = parserImpl.parser(empty);
        assertIterableEquals(expected, actual);
    }

    @Test
    void parseReport_MissingFieldsInRow_notOk() {
        List<String> invalidList = Arrays.asList(TITLE,
                "b,banana",
                "b,apple,100,",
                "s,banana,100,",
                "p,banana,13,",
                "r,apple,10,",
                "p,apple",
                "p,banana,155,",
                "s,banana,50");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> parserImpl.parser(invalidList));
    }
}

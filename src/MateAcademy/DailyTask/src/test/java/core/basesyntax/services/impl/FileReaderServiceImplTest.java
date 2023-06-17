package MateAcademy.DailyTask.src.test.java.core.basesyntax.services.impl;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileReaderServiceImplTest {

    private static FileReaderServiceImpl fileReaderService;
    private static List<String> dbOutput;
    private static final String CORRECT_PATH = "src/main/resources/input.csv";
    private static final String EMPTY_FILE = "src/main/resources/empty.csv";
    private static final String INCORRECT_PATH = "src/main/resources/No_name.csv";
    private static final String INVALID_FILE_TYPE = "path/to/invalid.txt";

    @BeforeAll
    static void beforeAll() {
        fileReaderService = new FileReaderServiceImpl();
        dbOutput = List.of("b,banana,20",
                "b,apple,100",
                "s,banana,100",
                "p,banana,13",
                "r,apple,40",
                "p,apple,20",
                "p,banana,5",
                "s,banana,50");
    }

    @Test
    void readFile_CorrectPath_ok() {
        List<String> containText = fileReaderService.readFromFile(new File(CORRECT_PATH));
        containText.remove(0);
        Assertions.assertEquals(dbOutput, containText);
    }

    @Test
    void readFile_IncorrectPath_notOk() {
        assertThrows(IllegalArgumentException.class,
                () -> fileReaderService.readFromFile(new File(INCORRECT_PATH)));
    }

    @Test
    void readFile_invalidType_notOk() {
        File invalidFile = new File(INVALID_FILE_TYPE);
        assertThrows(IllegalArgumentException.class,
                () -> fileReaderService.readFromFile(invalidFile));
    }

    @Test
    void readFile_EmptyFile_ok() {
        File empty = new File(EMPTY_FILE);
        List<String> expected = Collections.emptyList();
        List<String> actual = fileReaderService.readFromFile(empty);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void readFile_noInvalidLetters_ok() {
        File inputFile = new File(CORRECT_PATH);
        List<String> containText = fileReaderService.readFromFile(inputFile);
        containText.remove(0);
        for (String line : containText) {
            String[] values = line.split(",");
            String type = values[0].trim();
            assertTrue(type.equals("b")
                            || type.equals("s")
                            || type.equals("p")
                            || type.equals("r"),
                    "Invalid type found in line: " + line);
        }
    }

    @Test
    public void readFile_noExistenceFile_notOk() {
        assertThrows(RuntimeException.class, ()
                -> fileReaderService.readFromFile(new File(INCORRECT_PATH)));
    }
}

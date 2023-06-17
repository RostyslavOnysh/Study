package MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces;

import java.io.File;
import java.util.List;

public interface FileReaderService {
    List<String> readFromFile(File file);
}

package MateAcademy.DailyTask.src.main.java.core.basesyntax.services.impl;

import core.basesyntax.services.interfaces.WriteToFileService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileServiceImpl implements WriteToFileService {
    @Override
    public void writeReportToFile(String reportText, File toFile) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile))) {
            bufferedWriter.write(reportText);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write data to file: " + toFile, e);
        }
    }
}

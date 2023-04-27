package MateAcademy.Exception.TryCatchFinnaly.BufferWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class FileWriter {

    public void write(String destinationFile, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new java.io.FileWriter(destinationFile));
            writer.write(content.toLowerCase());
            if (true) {
                throw new IOException("Test exception");
            }
            writer.write(content.toUpperCase());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Can`t write to file " + destinationFile, e);
        }finally {
            if (writer != null){
                try {
                    writer.close();
                }catch (IOException e){
                    throw new RuntimeException("Can`t close resource",e);
                }
            }
        }
    }
}

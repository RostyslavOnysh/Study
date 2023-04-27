package MateAcademy.Files.WriteByteToFile;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;





public class example {
    public void writeBytesToFile(String fileName, byte[] data) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            throw new RuntimeException("Error writing file " + fileName, e);
        }
    }
}

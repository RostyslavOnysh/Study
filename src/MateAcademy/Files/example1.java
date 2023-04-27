package MateAcademy.Files;

import java.io.File;
import java.io.IOException;

public class example1 {
    // create a file and folder using File class and method

    public static void main(String[] args) {
        try {
            File folder = new File("myTestFolder");
            folder.mkdir();  // create folder make directory

            String filePath = "myTestFolder" + File.separator + "Hello.txt";
            // 1 - adress to file it`s mean name
            // File.separator = розділювач який розділяє між собою або дві папки або папку та файл
            File file = new File(filePath);
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Can`t creat file ((", e);
        }
    }
}

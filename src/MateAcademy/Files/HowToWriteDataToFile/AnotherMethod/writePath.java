package MateAcademy.Files.HowToWriteDataToFile.AnotherMethod;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class writePath {
    public static void main(String[] args) {
        String[] users = {"Bob", "John", "Alice"};
        File file = new File("users3.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Can`t create file", e);
        }
        for (String user : users) {
            //using util static class
            try {
                Files.write(file.toPath(), user.getBytes(), StandardOpenOption.APPEND);
                /*
                Данні знову перезатираются і залишаєтся лише останній юзер,тому ми використовуємо
                "StandardOpenOption.APPEND" для того щоб все додавалося а не перезаписувалось
                 */
            } catch (IOException e) {
                throw new RuntimeException("Can`t write data to file", e);
            }
        }
    }
}

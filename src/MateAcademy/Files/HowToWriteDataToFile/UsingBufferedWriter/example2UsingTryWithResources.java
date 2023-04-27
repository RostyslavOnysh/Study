package MateAcademy.Files.HowToWriteDataToFile.UsingBufferedWriter;

import java.io.*;

public class example2UsingTryWithResources {
    public static void main(String[] args) {
        String[] users = {"Bob", "John", "Alice"};
        File userName = new File("users2.txt");
        for (String user : users) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userName, true))) {
                bufferedWriter.write(user); // записуємо юзерів
            } catch (IOException e) {
                throw new RuntimeException("Can`t write data to file", e);
            }
        }
    }
}




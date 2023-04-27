package MateAcademy.Files.BifferedWriterFlush;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class example {
    public static void main(String[] args) {

        String[] users = {"John \n", "Bob \n", "Alice \n"};

        File file = new File("newExample.txt");

        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (String user : users) {
                bufferedWriter.write(user);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("Can`t write data to file", e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException("Can`t write data to file", e);
                }
            }
        }
    }
}

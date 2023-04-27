package MateAcademy.Files.HowToReadDataFronFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class example {
    public static void main(String[] args) {
        File file = new File("newExample.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
           // щоб вивести повністю файл потрбіно посимвольно зчитати наш контент.є
            // Необіхдно викликати метод bufferedReader поки не зщитаються всі символи
            int value = bufferedReader.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (value != -1){  // -1 для того щоб індентифікувати що ми считали абсолютно ві символи .
stringBuilder.append((char)value);
value= bufferedReader.read();
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            throw new RuntimeException("Can`t read the file", e);
        }
    }
}

package MateAcademy.Exception;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Example1 {
    public static void main(String[] args) {
        String content = readFile();
    }

    private static String readFile() {
        File file = new File("lines.txt");
        try {
            return Files.readString(file.toPath());
        } catch (IOException e) {                            // it`s a good practice
            return " ";
        }
    }
}


// checked Exception
 /*
        try {                                                     // під час виконання цього коду в блоці виникла помилка
            String content = Files.readString(file.toPath());
        } catch (IOException e) {                //  тут ми помилку відловили
            System.out.println("Exception");     // тут вивели що є помилка
        }

        */


  /*
     two ways to solv this exception :
        1. throws
        2. try catch
  */
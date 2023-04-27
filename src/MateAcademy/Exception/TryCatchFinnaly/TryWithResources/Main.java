package MateAcademy.Exception.TryCatchFinnaly.TryWithResources;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        String filename = "cities.txt";
        BufferedReader reader = null;

        try (BufferedReader newReader = Files.newBufferedReader(Paths.get(filename))) {
            System.out.println("Everything is ok");
        } catch (IOException e) {
            System.out.println("Can`t read file with name  = " + filename);
        }
    }
}

package MateAcademy.Files.HowToWriteDataToFile.UsingBufferedWriter;

import java.io.*;

public class example2 {
    public static void main(String[] args) {
        // how to write users name in file
//-----------------------------------------------------------------------------//
        // at first we create a String array which include names
        String[] users = {"Bob", "John", "Alice"};
//----------------------------------------------------------------------------//
        // after creating array we create a file
        File userName = new File("users.txt");
//--------------------------------------------------------------------------//
        // now we iterate in nameArray ,using for each loop we write every each name to user
        // для того щоб код скомпілювався з урахування закритого bufferedWriter потрібно створити екземпляр bufferedWriter
        for (String user : users) {
            BufferedWriter bufferedWriter = null;
            //для того щоб записати данні у файл нам потрібно створити : "bufferedWriter" та загортаємо все це в try i catch
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(userName, true));
                bufferedWriter.write(user); // записуємо юзерів
                // на данному єтапі файл буде містити лише одного юзера.Данні перезаписуются а потрабно допомнювати
            } catch (IOException e) {
                throw new RuntimeException("Can`t write data to file", e);
            } finally {
                try {
                    bufferedWriter.close(); // щоб файл не був пустий
                } catch (IOException e) {
                    throw new RuntimeException();
                }

            }
        }
    }
}


// це ще можна зробити використовуючи try with resources
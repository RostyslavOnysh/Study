package MateAcademy.OOP.Task.Printer;

import java.util.Arrays;

public class Printer {
    public String print(String message) {
        return message;
    }

    public String print(int message) {
        return String.valueOf(message);
    }

    public String print(double message) {
        return String.valueOf(message);
    }

    public String print(String message, int message1) {
        return "" + message + "" + String.valueOf(message1) + "";
    }

    public String print(String[] arra1) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arra1.length; i++) {
            sb.append(arra1[i]);
            if (i < arra1.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}




/*
Let's create a Printer class!

Our printer's main task is, of course, to print the input it receives, so it has a method print().

However, it can work with different data types:

if input is a string, the method returns this string;
if input is an integer or a double, the method returns this number as a string;
if input is a string and an integer, the method returns the string in the format "<string> and <int>";
if input is an array of strings, the method returns a string with the content of the input array (use Arrays.toString() method).
We have already created the method that takes a string. Will you add methods for other inputs to make our printer work?





 */

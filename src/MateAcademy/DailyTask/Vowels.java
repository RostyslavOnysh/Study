package MateAcademy.DailyTask;

public class Vowels {
    public static String removeVowel(String string) {
        return string.replaceAll("[AaEeIioOuU]","");
    }

    public static void main(String[] args) {
        String s = "Hello my world how are you";
        System.out.println(removeVowel(s));
    }
}
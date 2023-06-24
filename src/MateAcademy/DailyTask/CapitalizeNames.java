package MateAcademy.DailyTask;

public class CapitalizeNames {
    public static String[] capitalizeNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toLowerCase();
            if (!names[i].isEmpty()) {
                String firstLetter = names[i].substring(0, 1);
                String remainingLetters = names[i].substring(1);
                names[i] = firstLetter.toUpperCase() + remainingLetters;
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String [] array = {"JOHN","bOb","alice"};
        String[] strings = capitalizeNames(array);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
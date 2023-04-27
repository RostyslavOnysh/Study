package MateAcademy.JavaBasicExtended.ArraysExtended;

public class YesNo {
    public static String[] getStringArray(boolean[] values) {
        String firstValue = "Yes";
        String secondValue = "No";

        String[] newArray = new String[values.length];   //Для виправлення помилки необхідно створити масив newArray заздалегідь, з довжиною, рівною довжині масиву values.

        for (int i = 0; i < values.length; i++) {

            if (values[i] == true) {
                newArray[i] = firstValue;
            } else if (values[i] == false) {
                newArray[i] = secondValue;
            }
        }
        return newArray;
    }
}

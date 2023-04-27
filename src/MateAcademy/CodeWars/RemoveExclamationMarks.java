package MateAcademy.CodeWars;

public class RemoveExclamationMarks {
    class Solution {
        static String removeExclamationMarks(String s) {
            String delete = s.replaceAll(" ", "!");
            return delete;
        }
    }
}

package MateAcademy.DailyTask;

public class MessageValidator {
    public static boolean isValidMessage(String message) {
        if (message.equals("")) {
            return true;
        }
        int currentIndex = 0;
        char[] chars = message.toCharArray();

        while (currentIndex < chars.length) {
            StringBuilder currentChars = new StringBuilder();
            StringBuilder currentNumber = new StringBuilder();

            while (currentIndex < chars.length && Character.isDigit(chars[currentIndex])) {
                currentNumber.append(chars[currentIndex]);
                currentIndex++;
            }
            if (currentNumber.length() > 0) {
                int expectedChars = Integer.parseInt(currentNumber.toString());
                while (currentIndex < chars.length && Character.isLetter(chars[currentIndex])) {
                    currentChars.append(chars[currentIndex]);
                    currentIndex++;
                }
                int actualChars = currentChars.length();
                if (expectedChars != actualChars) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidMessage("3hey5hello2hi5"));
        System.out.println(isValidMessage(""));
    }
}
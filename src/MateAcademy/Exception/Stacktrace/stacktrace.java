package MateAcademy.Exception.Stacktrace;

public class stacktrace {
    //a stacktrace is a list of method calls that the application
    //was in the middle of when an Exception was thrown

    public static void main(String[] args) {
print();
    }

    public static void print() {
        String[] data = {"Hello", "world"};
        System.out.println(getMessage(data));
        String[] emptyData = {};
        System.out.println(getMessage(emptyData));
    }

    private static String getMessage(String [] data) {
        return getConcatenadedWords(data);
    }

    private static String getConcatenadedWords(String [] words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words){
            builder.append(word).append(" - ");
        }
        String message = builder.toString();
        String trimmed = message.substring(0, message.length() - 3);
        return trimmed;
    }
}

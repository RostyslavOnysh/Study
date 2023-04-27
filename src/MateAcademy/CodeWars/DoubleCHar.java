package MateAcademy.CodeWars;

public class DoubleCHar {
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "String";
        String s = doubleChar(s1);
        System.out.println(s);

    }
}


// double char
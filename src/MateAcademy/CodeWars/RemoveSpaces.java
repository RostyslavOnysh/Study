package MateAcademy.CodeWars;

public class RemoveSpaces {
    // main for check
   /*
    public static void main(String[] args) {
     String h = "One Two";
        String output = noSpace(h);
        System.out.println(output);
    }
    */


    public static String noSpace(final String x) {
      //  String withoutScpace = x.replaceAll("\\s+", "");
        return x.replaceAll("\\s+","");
    }
}


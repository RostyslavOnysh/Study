package MateAcademy.OOP.AbstrClassORInterface.StaticKeyword.Example;

public class Animal {
    private static String STATIC_FIELD = "";
    private String name = "abcd";

    // статичний блок ініціалізації

    static {
        STATIC_FIELD = "cbd";
    }


    public Animal(String name) {
        this.name = name;
    }
}

package MateAcademy.OOP.AbstrClassORInterface.StaticKeyword.Example;

public class Cat extends Animal {

    static {
        System.out.println("Cat static block");
    }

    {
        System.out.println("Cat non static block");
    }

    public Cat(String name) {
        super(name);
        System.out.println("Cat constructor");
    }
}

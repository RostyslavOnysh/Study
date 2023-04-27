package MateAcademy.OOP.AbstrClassORInterface.StaticKeyword;

public class main {
    public static void main(String[] args) {
        sayStatic();
        main main = new main();
        main.sayNonStatic();

        User bob = new User();
        User alice = new User();
        bob.name = "Bob";


        System.out.println(bob);
        System.out.println(alice);
    }

    public static void sayStatic() {
        System.out.println("Hello I am a static keyword");  // не потрібно створювати обьект для виклику
    }

    public void sayNonStatic() {
        System.out.println("Hello I am not a static keyword");  //для того щоб викликати в мейн потрібно створити екземпляр класу мейн
    }


}

package MateAcademy.EqualsAndHashcodeAndClone.Clone;

public class Main {
    public static void main(String[] args) {
            Adress adress = new Adress();
            adress.setStreet("shevchenka");


            User bob = new User();
            bob.setName("Bob");
            bob.setLastName("Alison");
            bob.setAdress(adress);

        System.out.println(bob);
       User clonedBob = (User) bob.clone();

        System.out.println(clonedBob);
    }
}

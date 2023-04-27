package MateAcademy.OOP.Example;

public class Examp {
    public static void main(String[] args) {
        Person bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);

        Person alice = new Student();
        alice.setAge(25);
        alice.setName("Alice");

Person john = new SuperStudent();
john.setName("John");
        System.out.println(bob.sayHello());
        System.out.println(alice.sayHello());
        System.out.println(john.sayHello());
        }
    }




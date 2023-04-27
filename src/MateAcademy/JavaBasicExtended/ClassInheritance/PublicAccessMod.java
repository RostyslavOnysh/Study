package MateAcademy.JavaBasicExtended.ClassInheritance;

public class PublicAccessMod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Borsuk";
        dog.tailLength = 14;
        boolean b = dog.hasOwner();
        dog.setOwner("Human");
    }
}

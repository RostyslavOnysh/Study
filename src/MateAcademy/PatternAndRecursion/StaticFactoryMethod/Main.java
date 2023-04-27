package MateAcademy.PatternAndRecursion.StaticFactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Standart initialization using constructor
        User bob = new User("Bob", 23);
        // Static factory method
        User alice = User.of("Alice",19);
        /*
        цей статичний фабричний метод of();
         потрібно реалізувати в тому класі об'єкт якого ми хочемо отримати
         в данному випадку це класс User
         */
    }
}

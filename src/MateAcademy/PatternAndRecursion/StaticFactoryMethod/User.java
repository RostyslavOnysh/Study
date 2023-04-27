package MateAcademy.PatternAndRecursion.StaticFactoryMethod;

public class User {
    private String name;
    private int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }
    /*
    в цьому місці будемо реалізовувати цей метод of(){}
    повинен включати в себе змінні of(String name, int age){}
     */

    public static User of(String name, int age){
        return new User("Alice",19);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package MateAcademy.OOP.Example;

public abstract class Person {
    private String name;
    private int age;

    public String getPersonInfo() {
        return "name: " + name + " ,age: " + age;
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

    // загальна для будь яких персон,але конкретна реалізація цієї поведінки повинна бути у кожного класу наслідника

    public abstract String sayHello(); // метод може бути без реалізації для того щоб кожен класс реалізовува по своєму
}


/*
якщо в класі є як мінімум один абстрактиний метод тоді класс повинен бути позначений abstract
 */
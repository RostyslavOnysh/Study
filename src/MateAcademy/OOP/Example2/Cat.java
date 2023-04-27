package MateAcademy.OOP.Example2;

public class Cat extends animal{
    private String color;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat (String name,int age,String color){
        super(name,age); // name and age з конструктора батькывського класу
        this.color = color;

        //спочатку цей конструктор не компілювався тому що потрібно викликати конструктор батьківського класу то шо супер а поті вже поле конкретино цього класу
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "color='" + getName() + '\'' +
                '}';
    }
}

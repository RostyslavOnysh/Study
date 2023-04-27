package MateAcademy.EqualsAndHashcodeAndClone.EqualsOverride;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private int inn;

    User(String name, int age, int inn) {
        this.name = name;
        this.age = age;
        this.inn = inn;
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

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public boolean equals(Object user) {
        if (user.getClass().equals(User.class)) {
            User current = (User) user;
            return Objects.equals(this.name, current.name)  // для стрінг і тд краще використовувати Objects.equals();
                    && this.age == current.age // для інт можна так
                    && this.inn == current.inn;
        }
        return false;
    }
    // hashcode return int, враховуємо всі поля які є в методі .equals();
    public int hashCode(){
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + age;
        result = 31 * result + inn;
        return result;
    }
}

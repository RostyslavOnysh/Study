package MateAcademy.JavaStreamAPIpart2Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    public class Person {
        private String name;
        private int age;
        private Sex sex;
        private List<Cat> cats;

        public Person(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            cats = new ArrayList<>();
        }

        public Person(String name, int age, Sex sex, List<Cat> cats) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.cats = cats;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        public List<Cat> getCats() {
            return cats;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return age == person.age
                    && Objects.equals(name, person.name)
                    && sex == person.sex
                    && Objects.equals(cats, person.cats);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex, cats);
        }

        @Override
        public String toString() {
            return "Person{"
                    + "name='" + name + '\''
                    + ", age=" + age
                    + ", sex=" + sex
                    + ", catList=" + cats
                    + '}';
        }

        public enum Sex {
            MAN, WOMAN
        }
    }


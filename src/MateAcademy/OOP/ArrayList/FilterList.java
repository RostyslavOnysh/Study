package MateAcademy.OOP.ArrayList;

import MateAcademy.OOP.Example.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
    private final List<Person> malePerson = new ArrayList<>();

    public List<Person> filter(List<Person> persons) {
        if (persons == null) {
            return malePerson;
        }
        for (Person person : persons) {
     //       if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("male")) {
     //           malePerson.add(person);
      //      }
        }
        return malePerson;
    }
}


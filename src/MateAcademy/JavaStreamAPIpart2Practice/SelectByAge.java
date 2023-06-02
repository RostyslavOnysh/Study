package MateAcademy.JavaStreamAPIpart2Practice;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SelectByAge {
    /**
     * Given a List of `Person` instances (having `name`, `age` and `sex` fields),
     * for example, `Arrays.asList( new Person(«Victor», 16, Sex.MAN),
     * new Person(«Helen», 42, Sex.WOMAN))`,
     * select from the List only men whose age is from `fromAge` to `toAge` inclusively.
     * <p>
     * Example: select men who can be recruited to army (from 18 to 27 years old inclusively).
     */
    public List<Person> selectMenByAge(List<Person> peopleList, int fromAge, int toAge) {
        return peopleList.stream()
                .filter(men -> men.getAge() >= fromAge
                        && men.getAge() <= toAge
                        && men.getSex() == Person.Sex.MAN)
                .collect(Collectors.toList());
    }
}

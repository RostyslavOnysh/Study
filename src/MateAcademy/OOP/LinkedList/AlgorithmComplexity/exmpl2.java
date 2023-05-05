package MateAcademy.OOP.LinkedList.AlgorithmComplexity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exmpl2 {
    public static void main(String[] args) {
        List<String> stringsArr = new ArrayList<>();
        stringsArr.add("first");
        stringsArr.add("second");
        List<String> stringsLinked = new LinkedList<>(stringsArr);
        System.out.println(stringsLinked.get(1));
    }
}

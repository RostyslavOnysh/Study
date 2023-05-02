package MateAcademy.OOP.ArrayList;

import java.util.List;

public class exmpl {
    public static int calculateSum(List<Integer> list) {
        if (list == null) {
            return 0;
        }
        int sumOfElement = 0;
        for (int i = 0; i < list.size(); i++) {
            sumOfElement += list.get(i);
        }
        return sumOfElement;
    }
}

/*
Create a method calculateSum() that accepts a List<Integer> and returns a total sum of all elements.

You should operate a List, not ArrayList.
Your method should return a single int.
 */
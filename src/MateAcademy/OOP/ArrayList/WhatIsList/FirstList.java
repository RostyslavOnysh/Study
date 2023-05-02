package MateAcademy.OOP.ArrayList.WhatIsList;

import java.util.ArrayList;
import java.util.List;

public class FirstList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // -> create List
        list.add(10); // -> add value to list using .add();
        list.add(20);
        list.add(30);
        // now trying to add a value at a specific index
        list.add(1, 15);
        // now removing value using index
        list.remove(2);
        //Update the value of an element by index
        list.set(2, 100);
        // how to delete element using his value ? use (Integer.valueOf(100));
        list.remove(Integer.valueOf(100));
        // how to get value using index ?
        System.out.println(list.get(1));
    }
}

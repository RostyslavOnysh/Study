package TrashHolder;

import java.util.ArrayList;

public class exmpl1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Float> floats = new ArrayList<>();
        if (integers.getClass() == floats.getClass()) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}

/*
However, if we compare the two objects using the equals() method, the result would be true.
This is because the equals() method is used to compare the content of two objects.
 In this case, both ArrayList<Integer> and ArrayList<Float> are instances of the same ArrayList class,
  and they have the same content, which is an empty list.

 This would output "Equal."
  since both integers and floats have the same class,
  which is java.util.ArrayList.
 */
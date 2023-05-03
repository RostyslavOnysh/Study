package MateAcademy.OOP.LinkedList;


public class exmpl {
    public static void main(String[] args) {
   /*     List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,15);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    */
        Node<Integer> newNode1 = new Node<>(null, 10, null);
        Node<Integer> newNode2 = new Node<>(newNode1, 20, null);
        newNode1.next = newNode2;
        Node<Integer> newNode3 = new Node<>(newNode2, 30, null);
        newNode2.next = newNode3;

        Node<Integer> currentNode = newNode1;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }

    }

    static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(Node<T> previous, T value, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}

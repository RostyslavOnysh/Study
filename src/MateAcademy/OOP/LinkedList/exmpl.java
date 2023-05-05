package MateAcademy.OOP.LinkedList;


import MateAcademy.OOP.LinkedList.Structure.LinkedListNode;

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
        Node<Integer> node1 = new Node<>(null, 10, null);
        Node<Integer> node2 = new Node<>(node1, 20, null);
        node1.next = node2;
        Node<Integer> node3 = new Node<>(node2, 30, null);
        node2.next = node3;

        Node<Integer> currentNode = node1;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    static class Node<T> {
        T value; // значення того типу Т яке будемо додавати в LinkedList
        Node<T> previous; // посилання на попередній елемент
        Node<T> next; // посилання на наступний елемент

        public Node(Node<T> previous, T value, Node<T> next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}

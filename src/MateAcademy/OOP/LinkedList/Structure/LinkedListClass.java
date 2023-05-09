package MateAcademy.OOP.LinkedList.Structure;

public class LinkedListClass<T> {

    private Node<T> head;
    private Node<T> tail;

    class Node<T> {
        Node<T> prev;
        T value;
        Node<T> next;

        public Node(Node<T> prev, T value, Node<T> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }


}

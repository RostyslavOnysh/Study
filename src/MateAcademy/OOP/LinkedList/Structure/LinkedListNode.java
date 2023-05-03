package MateAcademy.OOP.LinkedList.Structure;

public class LinkedListNode<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T value) {
        //       new Node<>(prev, value, next);
    }


    class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}


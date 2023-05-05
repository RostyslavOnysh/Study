package MateAcademy.OOP.LinkedList.AlgorithmComplexity.hw2;

public class DoublyLinkedList {
    public static void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        if (node.prev != null && node.next != null) {
            ListNode prevNode = node.prev;
            ListNode nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }
}



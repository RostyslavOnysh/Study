package MateAcademy.OOP.LinkedList.AlgorithmComplexity.hw3;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    public static void insertNode(ListNode previous, ListNode newNode) {
      ListNode nextNode = previous.next;

      newNode.prev = previous;
      newNode.next =  nextNode;

      previous.next = newNode;
      nextNode.prev = newNode;


    }
}


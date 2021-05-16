package com.company;

public class L1RemovelastNode {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(23);
        Node n2 = new Node(34);
        Node n3 = new Node(2);
        Node n4 = new Node(56);
        Node n5 = new Node(22);
        Node n6 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printLinkedList(n1);
        System.out.println(" after linked list changes ");
        n1 = removeLastNode(n1);
       // System.out.println(n1.data);
        printLinkedList(n1);


    }


    private static Node removeLastNode(Node head) {

        Node temp = head;
        while(temp.next.next != null ){
           temp = temp.next;
        }
        temp.next = null;

    return head;
    }

    private static void printLinkedList(Node n1) {

        while (n1 != null) {
            System.out.print(n1.data + " ");
            n1 = n1.next;
        }

    }
}

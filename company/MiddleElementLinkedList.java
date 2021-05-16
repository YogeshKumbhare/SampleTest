package com.company;

public class MiddleElementLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {

        Node n1 = new Node(23);
        Node n2 = new Node(34);
        Node n3 = new Node(2);
        Node n4 = new Node(9);
        Node n5 = new Node(22);
        Node n6 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        prntLinkedlist(n1);
        Node temp;
        temp = findMiddleElementV2(n1);
        findMiddleElementV1(n1);
        prntLinkedlist(temp);
    }

    private static void findMiddleElementV1(Node head) {

        Node singIncNode = head;
        Node doubIncNode = head;
        if(head == null) {
            System.out.println("The haed node is null, no elements in the linked list");
        }

        while(doubIncNode != null && doubIncNode.next != null) {
            doubIncNode = doubIncNode.next.next;
            singIncNode = singIncNode.next;
        }
        System.out.println("Middle Element: "+ singIncNode.data);

    }

    private static Node findMiddleElementV2(Node head) {
            /**
             * In this method, first we get the element count by traversing through the linked list.
             * Then we identify middle element index by count.
             * Then traverse through linked list nodes based on count.
             */

        Node countNode = head;
        int count = 0;

        while (countNode != null) {
            countNode = countNode.next;
            count++;
        }
        count = count / 2;
        while (head != null) {
            head = head.next;
            count--;

            if (count == 0) {
                System.out.println(" middle element  " + head.data);

            }
        }

        return null;
    }

    private static void prntLinkedlist(Node n1) {

        while (n1 != null) {
            System.out.print(n1.data + " ");
            n1 = n1.next;

        }
    }

}

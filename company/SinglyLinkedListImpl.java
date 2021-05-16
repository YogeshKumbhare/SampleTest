package com.company;

class Node<T> implements Comparable<T> {
    T data;
    Node<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public int compareTo(T arg) {
        if (arg == this.data) {
            return 0;
        } else {
            return 1;
        }
    }
}

public class SinglyLinkedListImpl<T> {
    private Node<T> head;

    public static void main(String[] args) {

        SinglyLinkedListImpl<Integer> n1 = new SinglyLinkedListImpl<Integer>();
        n1.add(23);
        n1.add(45);
        n1.add(87);
        n1.add(56);
        n1.add(33);

        //reverseLinkedlist(n1);
        System.out.println("after traverse remove element");
        n1.prntLinkedlist();
        n1.reverse();
        n1.prntLinkedlist();
    }

    private void prntLinkedlist() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData()+ " ");
            temp = temp.next;

        }
    }

    private void add(T n) {

        Node<T> nd = new Node<>();
        nd.setData(n);

        Node<T> tmp = head;

        while (true) {
            if (tmp == null) {
                //since there is only one element, both head and
                //tail points to the same object.
                head = nd;
                break;
            } else if (tmp.getNext() == null) {
                tmp.setNext(nd);
                break;
            } else {
                tmp = tmp.getNext();
            }
        }

    }

    public void reverse(){

        System.out.println("\nreversing the linked list\n");
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        head = prev;
    }
}

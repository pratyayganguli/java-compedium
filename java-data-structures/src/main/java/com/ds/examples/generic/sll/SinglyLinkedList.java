package com.ds.examples.generic.sll;

public class SinglyLinkedList {
    Node head;
    int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(int data){
        Node node = new Node(data);
        node.next = null;
        head = node;
        size += 1;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}

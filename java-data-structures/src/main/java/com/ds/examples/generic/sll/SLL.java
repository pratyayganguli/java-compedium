package com.ds.examples.generic.sll;

public class SLL {
    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public void insertHead(int value){
        if(head == null){
            head = new Node(value);
        }
        else{
            Node node = new Node(value);
            node.next = head;
            head = node;
        }
    }

    public void insertTail(int value){
        Node currentNode = head;

        if(currentNode == null){
            System.out.println("no data inside the linked list");
            return;
        }

        while(currentNode != null){
            if(currentNode.next == null){
                Node newNode =  new Node(value);
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void display(){
        Node currentNode = head;
        System.out.println("Data inside the linked list");
        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}

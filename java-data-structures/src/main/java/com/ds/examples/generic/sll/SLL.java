package com.ds.examples.generic.sll;

class SLL {
    private Node head;
    private Node tail;
    public void insertHead(int value){
        if(head == null){
            head = new Node(value);
            if(tail == null){
                tail = head;
            }
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void insertTail(int value){
        if(tail == null){
            System.out.println("no elements here");
            return;
        }
        Node node = head;
        while(true){
            if(node.next == null){
                Node newNode = new Node(value);
                node.next = newNode;
                tail = newNode;
                return;
            }
            node = node.next;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("no elements here");
            return;
        }
        Node node = head;
        while(node != null){
            System.out.print(node.value + " - ");
            node = node.next;
        }
        System.out.println("Head : " + head.value + " Tail : " + tail.value);
    }

    public void deleteHead(){
        if(head == null){
            System.out.println("no elements here");
            return;
        }
        head = head.next;
        System.out.println("deleted head");
    }

    public void deleteTail(){
        if(tail == null){
            System.out.println("no elements here");
            return;
        }
        Node node = head;
        while(true){
            if(node == null){
                System.out.println("no elements here");
                return;
            }
            if(node.next == tail){
                node.next = null;
                tail = node;
                System.out.println("deleted tail");
                return;
            }
            node = node.next;
        }
    }

    public void search(int value){
        if(head == null){
            return;
        }
        Node node = head;
        int pos = 0;
        while(true){
            if(node == null){
                System.out.println("no elements here");
                break;
            }
            if(node.value == value){
                System.out.println("position : "+ pos);
                return;
            }
            node = node.next;
            pos = pos + 1;
        }
        System.out.println("node not present");
    }

    public void reverse(){
        /**
         *
         *  2 -> 3 -> 4 -> 5
         *  5 -> 4 -> 3 -> 2
         *
         */

        if(head != null){

        }

        Node currentNode = head;
        Node prevNode;
        Node nextNode;


    }

    class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}

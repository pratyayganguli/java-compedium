package com.ds.examples;

import com.ds.examples.generic.sll.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(100);
        singlyLinkedList.insert(200);
        singlyLinkedList.insert(300);
        singlyLinkedList.display();
    }
}

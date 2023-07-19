package com.ds.examples;


import com.ds.examples.generic.sll.SLL;

public class Main {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertHead(10);
        sll.insertHead(20);
        sll.insertHead(30);
        sll.insertTail(40);
        sll.display();
    }
}

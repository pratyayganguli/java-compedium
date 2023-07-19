package com.ds.examples.generic.sll;



public class Main {

    /**
     * @task:
     * add 10, 20, 30 in head
     * add 100, 200, 300 in tail
     * delete from head
     * delete from tail
     */

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertHead(10);
        sll.display();
        sll.insertHead(20);
        sll.display();
        sll.insertHead(30);
        sll.display();
        sll.insertTail(100);
        sll.display();
        sll.insertTail(200);
        sll.display();
        sll.insertTail(300);
        sll.display();
        sll.deleteHead();
        sll.display();
        sll.deleteTail();
        sll.display();
        sll.search(100);
    }
}

package com.company;

public class Node {
    private Employee worker;
    private Node next;

    public Node(Employee worker){
        this.worker = worker;
    }

    public Employee getWorker() {
        return worker;
    }

    public void setWorker(Employee worker) {
        this.worker = worker;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

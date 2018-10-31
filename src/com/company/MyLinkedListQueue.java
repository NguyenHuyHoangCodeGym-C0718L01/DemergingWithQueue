package com.company;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public Node getTail() {
        return head;
    }

    public void enqueue(Employee worker){
        Node temp = new Node(worker);
        if(this.tail == null){
            this.head = this.tail = temp;
            System.out.println("Enqueue operation is done ! "+worker.getName()+" is first element of queue");
            return;
        }
        this.tail.setNext(temp);
        this.tail = temp;
        System.out.println("Enqueue operation is done ! "+worker.getName()+" just push to queue");
    }

    public Node dequeue(){
        if(this.head == null){
            System.out.println("Enqueue operation is done ! Nothing in queue");
            return null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        if(this.head == null){
            this.tail = null;
        }
        System.out.println("Dequeue operation is done ! "+temp.getWorker().getName()+", "+temp.getWorker().getSex()+", "+temp.getWorker().getAge()[0]+"/"+temp.getWorker().getAge()[1]+"/"+temp.getWorker().getAge()[2]+" just remove from queue");
        return temp;
    }
}

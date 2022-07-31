package com.Bridgelabz.StackAndQueues;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("--Welcome to the Queues Program.--");
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
    }
}

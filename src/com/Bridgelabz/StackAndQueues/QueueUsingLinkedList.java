package com.Bridgelabz.StackAndQueues;

public class QueueUsingLinkedList {
    QNode front, rear;
    class QNode {
        int key;
        QNode next;

        // constructor to create a new linked list node
        public QNode(int key)
        {
            this.key = key;
            this.next = null;
        }
    }
    // queue class
    public QueueUsingLinkedList()
    {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key)
    {
        QNode temp = new QNode(key);
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
    // Method to remove an key from queue.

    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;
        // Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
    }
    public void displayQueue() {
        QNode temp = front;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

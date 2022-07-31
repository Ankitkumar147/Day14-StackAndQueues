package com.Bridgelabz.StackAndQueues;

import static java.lang.System.exit;

public class StackUsingLinkedList {
    Node head;

    StackUsingLinkedList()
    {
        this.head = null;
    }
    private class Node
    {
        int data;
        Node link;
    }
    public void push(int x){
        Node newNode = new Node();
        if (newNode == null){
            System.out.println("Empty Stack");
            return;
        }
        newNode.data = x;
        newNode.link = head;
        head = newNode;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int peek(){
        if(!isEmpty()){
            return head.data;
        } else {
            System.out.println("Stack is Empty.");
            return 0;
        }
    }
    public void pop(){
        if (head == null){
            System.out.println("Stack is Empty.");
            return;
        }
        head = (head).link;
    }
    public void display(){
        if (head == null){
            System.out.println("Stack is Empty.");
            exit(1);
        }
        else {
            Node newNode = head;
            while(newNode != null ){
                System.out.printf("%d->",newNode.data);
                newNode = newNode.link;
            }
        }
    }
}

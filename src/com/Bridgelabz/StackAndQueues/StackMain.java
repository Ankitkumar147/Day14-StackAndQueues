package com.Bridgelabz.StackAndQueues;

public class StackMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stack And Queues Program.");
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        System.out.println("\nTop Element :- "+stack.peek());
        stack.pop();
        stack.display();
        System.out.println("\nTop Element :- "+stack.peek());
        stack.pop();
        stack.display();
        System.out.println("\nTop Element :- "+stack.peek());
        stack.pop();
        stack.display();
    }
}

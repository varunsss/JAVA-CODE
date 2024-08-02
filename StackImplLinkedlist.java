package com.dsimpl;

public class StackImplLinkedlist {
	// Define Node of LinkedList 
	private class Node{
		int data;   // node data 
		Node nlink; // Node link 
	}
	
	// top of the stack 
    Node top; 
    // stack class Constructor 
    StackImplLinkedlist()  { 
        this.top = null; 
    } 
    // isEmpty () operation
    public boolean isEmpty()  { 
        return top == null; 
    } 
    // push () operation 
    public void push(int val)  { 
        // create a new node 
        Node temp = new Node(); 
   
        // checks if the stack is full 
        if (temp == null) { 
            System.out.print("\nStack Overflow"); 
            return; 
        } 
   
        // assign val to node 
        temp.data = val; 
        // set top of the stack to node link
        temp.nlink = top; 
   
        // update top 
        top = temp; 
    } 
    
 // peek () operation 
    public int peek()  { 
        // check if the stack is empty 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
            System.out.println("Stack is empty!"); 
            return -1; 
        } 
    } 
 // pop () operation 
    public void pop() { 
        // check if stack is out of elements 
        if (top == null) { 
            System.out.print("\nStack Underflow!!"); 
            return; 
        } 
        // set top to point to next node 
        top = (top).nlink; 
    } 
    
    //print stack contents
    public void display()   { 
        // check for stack underflow 
        if (top == null) { 
            System.out.printf("\nStack Underflow!!"); 
           // exit(1); 
        } 
        else { 
            Node temp = top;
            System.out.println("Stack elements:");
            while (temp != null) { 
                  // print node data
                System.out.print(temp.data + "->");
                // assign temp link to temp 
                temp = temp.nlink; 
            } 
        } 
    } 
 
    
	public static void main(String[] args) {
		
		 // Create a stack class object 
		StackImplLinkedlist stack_obj = new StackImplLinkedlist(); 
        // push values into the stack
        stack_obj.push(9); 
        stack_obj.push(7); 
        stack_obj.push(5); 
        stack_obj.push(3); 
        stack_obj.push(1); 
   
        // print Stack elements 
        stack_obj.display(); 
   
        // print current stack top
        System.out.println("\nStack top : " + stack_obj.peek());
 
        // Pop elements twice 
        System.out.println("Pop two elements");
        stack_obj.pop(); 
        stack_obj.pop();
   
        // print Stack elements 
        stack_obj.display(); 
   
        // print new stack top 
        System.out.println("\nNew Stack top:" + stack_obj.peek()); 
	}
}

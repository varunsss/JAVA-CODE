package com.dsimpl;

public class StackImplArray {
	int top;
	int maxsize=5;
	int[] stack_arry=new int[maxsize];
	
	StackImplArray(){            
	        top = -1;  
	}
	boolean isEmpty(){         
		return (top < 0);  
	} 
	
	boolean push(int val) {
		 if(top == maxsize-1) {  
	            System.out.println("Stack Overflow !!");  
	            return false;  
	        }  
	        else  {  
	            top++;  
	            stack_arry[top]=val;  
	            return true;  
	        }  
	}
	
		boolean pop() {
			if(top==-1) {
				System.out.println("Underflow...");
				 return false; 
			}else {
				System.out.println("\nItem popped: " + stack_arry[top--]);  
				return true;
			}
	}
		void display () {           //print the stack elements  
	        System.out.println("Printing stack elements .....");  
	        for(int i = top; i>=0;i--) {  
	            System.out.print(stack_arry[i] + " ");  
	        }  
	    }  
	public static void main(String[] args) {
		 //define a stack object
		StackImplArray stck = new StackImplArray();
	    System.out.println("Initial Stack Empty : " + stck.isEmpty());
	    //push elements
	    stck.push(10);
	    stck.push(20);
	    stck.push(30);
	    stck.push(40);
	    System.out.println("After Push Operation...");
	    //print the elements
	    stck.display();
	    //pop two elements from stack
	    stck.pop();
	    stck.pop();
	    System.out.println("After Pop Operation...");
	    //print the stack again
	    stck.display();
	}
}

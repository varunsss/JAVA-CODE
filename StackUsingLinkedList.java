package com.dsimpl;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

	private int length; 
	private NodeClass top;
	
	StackUsingLinkedList(){
		length=0;
		top=null;
	}
	
	public void push(int data) {
		
		NodeClass ns=new NodeClass(data);
		ns.setNext(ns);
		top=ns;
		length++;
	}
	public boolean isEmpty()
	{
		return length==0; 
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int res=top.getData();
		top=top.getNext();
		length++;
		return res;
	}
	public int size() {
		return length;
	}
	
	
}

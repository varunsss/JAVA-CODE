package com.dsimpl;

public class NodeClass {

	public int data;
	public NodeClass next;
	
	public NodeClass(int data) {
		this.data=data;
		this.next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeClass getNext() {
		return next;
	}

	public void setNext(NodeClass next) {
		this.next = next;
	}
	
	
 
	
	
}

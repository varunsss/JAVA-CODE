package com.logic;

public class OverLoading {
	
	void test(int t) {
		System.out.println("primitive");
	}
	void test(Integer t) {
		System.out.println("wrapper");
	}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.test(1);
	}
}

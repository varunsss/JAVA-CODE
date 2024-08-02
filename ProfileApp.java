package com.logic;

import java.util.ArrayList;
import java.util.Iterator;
// https://www.youtube.com/watch?v=AHLkbqcVLvY
public class ProfileApp {
	public static void main(String[] args) {
		System.out.println("--------------------start");
		
		ArrayList<Emp> ar=new ArrayList();
		for (int i=1;i<10000;i++) {

			ar.add(new Emp());
		}
		//https://www.youtube.com/watch?v=AHLkbqcVLvY
		System.out.println("--------------------end");
	}

}

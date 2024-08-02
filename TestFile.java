package com.logic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestFile {

	public static void main(String[] args) throws IOException {
		/*
		 * String tt458="D:/GCOFILE_21032024/test.txt"; //String
		 * tt458="D:/GCOFILE_21032024/TT112T0_20211210.002"; // String
		 * tt458="D:/GCOFILE_21032024/IPM_OUT_13482183342_150826.txt"; BufferedReader
		 * bfrd = null; bfrd = new BufferedReader( new InputStreamReader( new
		 * FileInputStream(tt458))); byte[] st2; while ((st2 =
		 * bfrd.readLine().getBytes()) != null) {
		 * 
		 * System.out.println( st2);
		 * 
		 * }
		 */
		
		ArrayList<String> ar=new ArrayList();
		ar.add("a");
		ar.add("b");
		ArrayList<String> list2 =(ArrayList<String>) Collections.unmodifiableList(ar);
		list2.add("c");
		Iterator it=ar.iterator();
		while (it.hasNext()) {
			String s=(String)it.next();
		 
			System.out.println(s);
		}
		/*
		 * System.out.println(ar); ar.add("c"); System.out.println(ar);
		 */
	}
}

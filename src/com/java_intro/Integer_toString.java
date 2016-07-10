package com.java_intro;

import java.util.ArrayList;
import java.util.List;
// https://www.hackerrank.com/challenges/java-int-to-string
/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. 
If your code successfully converts  into a string  the code 
will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.
 */
import java.util.Scanner;

public class Integer_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println("enter integer:");
			int n=in.nextInt();
			//String s=Integer.toString(n);
			//String s=String.valueOf(n); 
		 	//Integer intr = new Integer(n);String s= intr.toString();
			// or 
			// do the hard way below (prefer for interview)
			// note how about convert int to hex? see
			///Users/alanc/Documents/workspace/Top10/src/com/string/int_to_hex_str.java
		    
			List<Character> lc = new ArrayList<Character>();
		    int val = n;
		    while (val / 10 != 0) {
		        int r = val % 10;
		        char rc = (char) (r+'0');
		        val = val / 10;
		        lc.add(rc);
		    }
		    lc.add((char) (val+'0'));
		    char[] ca = new char[lc.size()];
		    for (int i=0, j=lc.size()-1; i<lc.size(); i++, j--){
		        ca[j]=lc.get(i);
		    }
		    String s = new String(ca);
			
			//if(n==Integer.parseInt(s))
 			if(n==Integer.valueOf(s))
				System.out.println("Good job");
			else
				System.out.println("Wrong answer.");
			
		}
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

}

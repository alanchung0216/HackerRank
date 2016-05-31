package com.java_intro;
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
			String s=Integer.toString(n);
			//String s=String.valueOf(n); 
		 	//Integer intr = new Integer(n);String s= intr.toString();
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

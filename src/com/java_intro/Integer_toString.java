package com.java_intro;

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
			if(n==Integer.parseInt(s))
				System.out.println("Good job");
			else
				System.out.println("Wrong answer.");
			
		}
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

}

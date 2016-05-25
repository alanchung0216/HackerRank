package com.java_intro;

import java.util.Scanner;

public class stdin_stdout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 42
		 * 3.1415
		 * Welcome to HackerRank Java tutorials!
		 */
		Scanner sc = new Scanner(System.in);
		
		// first approach
		System.out.printf("%s","please enter integer: ");
		int i = sc.nextInt();
		System.out.printf("%s","please enter double: ");		
		double d = sc.nextDouble();
		System.out.printf("%s","please enter string: ");		
		sc.nextLine(); // remove \n in keyboard buffer because read Double did not consume \n
		String s = sc.nextLine();
		
		// second approach
		/*
		String si = sc.nextLine();
		String sd = sc.nextLine();
		String s = sc.nextLine();
		int i = Integer.valueOf(si);
		double d = Double.valueOf(sd);
		*/
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
		

	}

}

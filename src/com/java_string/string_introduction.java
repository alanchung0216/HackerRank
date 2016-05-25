package com.java_string;

import java.util.Scanner;

public class string_introduction {
	/*
	 * Input Format

		Two strings, the first being  A and the second being B . 
		They are comprised of lowercase English letters (no symbols or spaces) 
		and may not be on the same line.
		
		Output Format
		
		There are three lines of output: 
		For the first line, sum the lengths of A and B. 
		For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
		For the third line, capitalize the first letter in both A 
		and  B and print them on a single line, separated by a space.
		
		Sample Input
		
		 hello
		 java
		 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		String first = sc.nextLine();
		String second = sc.nextLine();
		char[] f_ca = first.toCharArray();
		char[] s_ca = second.toCharArray();
		f_ca[0] = Character.toUpperCase(f_ca[0]);
		s_ca[0] = Character.toUpperCase(s_ca[0]);
		
		boolean ret = first.compareTo(second) > 0;
		
		System.out.println(first.length()+second.length());
		System.out.println(ret?"Yes":"No");
		System.out.println(new String(f_ca)+ " " + new String(s_ca));
	}

}

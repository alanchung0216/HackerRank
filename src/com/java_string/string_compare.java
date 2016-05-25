package com.java_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class string_compare {
	/*
	 * Given a string, find out the lexicographically smallest and largest substring of length k.

	[Note: Lexicographic order is also known as alphabetic order dictionary order.
	 So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always 
	 comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

	Input Format

	First line will consist a string containing english alphabets which has at most 1000 characters. 
	2nd line will consist an integer k.

	Output Format

	In the first line print the lexicographically minimum substring. 
	In the second line print the lexicographically maximum substring.

	Sample Input
	
	welcometojava
	3
	
	Sample Output
	
	ava
	wel
	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String s = sc.next();
		System.out.println("enter num char for substring: ");		
		int k = sc.nextInt();
		List<String> ll = new ArrayList<String>();
		String max = s.substring(0,k); // substring 0,3 mean to capature 0,1,2
		String min = s.substring(0,k);
		for (int i=0; i<s.length()-k+1; i++){
			if (s.substring(i,i+k).compareTo(min) < 0)
				min = s.substring(i,i+k);
			if (s.substring(i,i+k).compareTo(max) > 0)
				max = s.substring(i,i+k);
		}
		System.out.println(min);
		System.out.println(max);
	}

}

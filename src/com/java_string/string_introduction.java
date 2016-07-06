package com.java_string;

//https://www.hackerrank.com/challenges/java-strings-introduction
/*
"A string is traditionally a sequence of characters, either as a 
literal constant or as some kind of variable." — Wikipedia: 
String (computer science)

This exercise is to test your understanding of Java Strings. 
A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of 
characters in a String is called the length, and it can be retrieved 
with the String.length() method.

Given two strings of lowercase English letters,  and , perform the 
following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come 
before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, 
separated by a space.

Input Format

Two strings, the first being  and the second being . They are 
comprised of lowercase English letters (no symbols or spaces) and 
may not be on the same line.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  
or No if it is not. 
For the third line, capitalize the first letter in both  and  and 
print them on a single line, separated by a space.

Sample Input

 hello
 java
 
Sample Output

9
No
Hello Java


Explanation

String  is "hello" and  is "java". 
 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" comes 
before "java"; therefore,  is not larger than  and the answer is No. 
When you capitalize the first letter of both  and  and then print 
them separated by a space, you get "Hello Java".
 */

import java.util.Scanner;

public class string_introduction {
//	import java.io.*;
//	import java.util.*;

//	public class Solution {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter first : ");
	        String A=sc.next();
	        System.out.println("enter second : ");
	        String B=sc.next();
	        
	        System.out.println(A.length()+B.length());
	        System.out.println((A.compareTo(B) > 0) ? "Yes": "No");
	        char[] cA = A.toCharArray();
	        char[] cB = B.toCharArray();
	        cA[0] = Character.toUpperCase(cA[0]);
	        cB[0] = Character.toUpperCase(cB[0]);
	        System.out.println(String.valueOf(cA)+" "+String.valueOf(cB));
	        sc.close();
	    }
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string: ");
		String first = sc.nextLine();
		System.out.println("enter second string: ");		
		String second = sc.nextLine();
		char[] f_ca = first.toCharArray();
		char[] s_ca = second.toCharArray();
		f_ca[0] = Character.toUpperCase(f_ca[0]);
		s_ca[0] = Character.toUpperCase(s_ca[0]);
		
		boolean ret = first.compareTo(second) > 0;
		
		System.out.println(first.length()+second.length());
		System.out.println(ret?"Yes":"No");
		System.out.println(new String(f_ca)+ " " + new String(s_ca));
		sc.close();
	}
	*/



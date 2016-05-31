package com.java_intro;

import java.util.Scanner;

public class stdin_stdout {

	public static void main(String[] args) {

		// https://www.hackerrank.com/challenges/java-stdin-stdout
/*

Input Format

There are three lines of input. 
Line one contains an integer. 
Line two contains a double. 
Line three contains a String.

Output Format

On the first line, print String: followed by the unaltered input String. 
On the second line, print Double: followed by the unaltered input double. 
On the third line, print Int: followed by the unaltered input integer.

To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample Input

42
3.1415
Welcome to HackerRank Java tutorials!
Sample Output

String: Welcome to HackerRank Java tutorials!
Double: 3.1415
Int: 42
Note: Do not concern yourself with formatting the output 
at this time; the goal here is to acquaint yourself with 
stdin and stdout.
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

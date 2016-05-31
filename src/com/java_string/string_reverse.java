package com.java_string;
// https://www.hackerrank.com/challenges/java-string-reverse
/*
A palindrome is a word, phrase, number, or other sequence of 
characters which reads the same backward or forward.(Wikipedia)
Given a string , print "Yes" if it is a palindrome, 
print "No" otherwise. 
The strings will consist lower case english letters only. 
The strings will have at most 50 characters.

Some examples of palindromes are "madam", "anna", "reviver".

Sample Input

madam

Sample Output

Yes

 */
import java.util.Scanner;

public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to check palindrome: ");
		String str = sc.nextLine();
		boolean palin = true;
		for (int i=0; i< str.length()/2; i++){
			if (str.charAt(i) != str.charAt(str.length() -i -1)){
				palin = false;
				break;
			}
		}
		System.out.println(palin ? "Yes" : "No");
		sc.close();
	}

}

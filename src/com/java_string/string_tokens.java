package com.java_string;
// https://www.hackerrank.com/challenges/java-string-token
/*
Given a string, find number of words in that string. For this 
problem a word is defined by a string of one or more english alphabets.

There are multiple ways to tokenize a string in java, 
learn how to tokenize a string in java and demonstrate your 
skill by solving this problem!

Input Format
A string not more than 400000 characters long. The string can be 
defined by following regular expression:

[A-Za-z !,?.\_'@]+
That means the string will only contain english alphabets, blank 
spaces and this characters: "!,?._'@".

Output Format
In the first line, print number of words  in the string. The words 
don't need to be unique. In the next  lines, print all the words 
you found in the order they appeared in the input.

Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

 */
import java.util.Scanner;

public class string_tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Usually you will use tokenize() or split() using
		pattern of delimiter like “ “ or “,” or “:”
		this denim is regular expression pattern
		*/
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string to see tokenized words: ");
        String s=scan.nextLine();
        String delim = "[ !,?._'@]+";
        String[] strArr=s.trim().split(delim);
        System.out.println(strArr.length);
        for (int i=0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }
        scan.close();
	}

}

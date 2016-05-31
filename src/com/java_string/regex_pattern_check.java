package com.java_string;
// https://www.hackerrank.com/challenges/pattern-syntax-checker
/*
Using Regex, we can easily match or search for patterns in a text. 
Before searching for a pattern, we have to specify one using some 
well-defined syntax.

In this problem, you are given a pattern. You have to check whether 
the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it 
using the Pattern.compile method.

Input Format

The first line of input contains an integer , denoting the number 
of testcases. The next lines contain a string of any printable 
characters representing the pattern of a regex.

Output Format

For each testcase, print "Valid" if the syntax of the given pattern 
is correct. Otherwise, print "Invalid". Do not print the quotes.

Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output

Valid
Invalid
Invalid

 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regex_pattern_check {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		int num = in.nextInt();
		in.nextLine();
		for (int i=0; i< num; i++){
	         String pattern = in.nextLine();
	         try {
	                Pattern p = Pattern.compile(pattern);
	                if (p != null) 
	                	System.out.println("Valid");
	                else
	                	System.out.println("Invalid");
	         }
	         catch (PatternSyntaxException e) {
	             System.out.println("Invalid");
	         }
		}
		in.close();

	}

}

package com.java_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-output-formatting
/*		Input Format

		Every line of input will contain a String followed by an integer. 
		Each String will have a maximum of  alphabetic characters, and each 
		integer will be in the inclusive range from  to .

		Output Format

		In each line of output there should be two columns: 
		The first column contains the String and is left justified using exactly  characters. 
		The second column contains the integer, expressed in exactly  
		digits; if the original input has less than three digits, 
		you must pad your output's leading digits with zeroes.
 */
/*
 * java 100
 * cpp 65
 * python 50
 */

public class output_format {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("=================");
		while (sc.hasNext()){ // when user do control-d this hasNext will detect End of File
			String line = sc.nextLine();
			String[] str = line.split(" ");
			int n = Integer.valueOf(str[1]);
			System.out.printf("%-15s%03d%n",str[0],n);
		}
		System.out.println("=================");
		sc.close();

	}

}

package com.java_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regex_pattern_check {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
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

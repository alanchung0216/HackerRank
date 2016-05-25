package com.java_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IP_pattern {
	// IP address is a string in the form "A.B.C.D", 
	// where the value of A, B, C, and D may range from 0 to 255. 
	// Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.	
	/*
	Some valid IP address:

		000.12.12.034
		121.234.12.12
		23.45.12.56
		
		this is simplified to handle any 999.888......
		^\d{1,3}(\.\d{1,3}){3}$
		String pattern = "^\\d{1,3}(\\.\\d{1,3}){3}$"
		
		this is complete to reject 666.666.23......
^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])(\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$
		String pattern = 
"^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])(\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$"	
	Some invalid IP address:

		666.666.23.23
		.213.123.23.32
		23.45.22.32.
		I.Am.not.an.ip
	*/
	
	    //String pattern = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
	

	public static void main(String[] args) {
		
	   	Scanner sc = new Scanner(System.in);
    	Matcher matcher=null;
        while (true) {
        	try {
	        	//below is one argument compile method
	        	System.out.println("Enter your regex: ");
	        	String regex = sc.nextLine();
	            Pattern pattern = Pattern.compile(regex);            
	            System.out.println("Enter input string to search: ");
	            String input_string = sc.nextLine();
	            matcher = pattern.matcher(input_string);
        	}
            catch (PatternSyntaxException pse) {
                System.out.printf("There is a problem" +
                        " with the regular expression!%n");
                System.out.printf("The pattern in question is: %s%n",
                        pse.getPattern());
                System.out.printf("The description is: %s%n",
                        pse.getDescription());
                System.out.printf("The message is: %s%n",
                        pse.getMessage());
                System.out.printf("The index is: %s%n",
                        pse.getIndex());
                System.exit(0);	
            }
            boolean found = false;
            while (matcher.find()) {
            	System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
            	System.out.printf("No match found.%n");
            }
        }
    }
}

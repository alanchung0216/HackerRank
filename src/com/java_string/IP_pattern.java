package com.java_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


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
class myRegex {
	//String pattern = "^\\d{1,3}(\\.\\d{1,3}){3}$";
	String pattern = "^25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9](\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$";
	
}
public class IP_pattern {
	


    public static void main(String []args) throws FileNotFoundException
    {
    	File file = new File(args[0]);
    	Scanner in = new Scanner(file);
        //Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP);
            System.out.println(new myRegex().pattern);
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }

}

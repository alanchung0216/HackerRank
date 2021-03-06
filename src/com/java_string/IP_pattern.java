package com.java_string;
// https://www.hackerrank.com/challenges/java-regex
/*
Write a class called myRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the 
pattern such that it can be used to validate an IP address. 
Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value 
of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
The length of A, B, C, or D can't be greater than 3.

Some valid IP address:

000.12.12.034
121.234.12.12
23.45.12.56

Some invalid IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip

In this problem you will be provided strings containing any 
combination of ASCII characters. You have to write a regular 
expression to find the valid IPs.

Just write the myRegex class, and we will append your code after 
the following piece of code automatically before running it:

Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output

true
true
true
false
false
false

 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*		
		this is a simplified one to handle any 999.888......
		^\d{1,3}(\.\d{1,3}){3}$
		String pattern = "^\\d{1,3}(\\.\\d{1,3}){3}$"
		
		this is a complete one  to reject 666.666.23......
^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])(\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$
		String pattern = 
"^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])(\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$"	


*/
/* this one work when I enter from console in 
 * /Users/alanc/Documents/workspace/JavaOracleRegex/src/com/java_reges/RegexTestHarness.java
 but not here.
 25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]
\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]
\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]
\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]

*/
class myRegex {
	String pattern = "^\\d{1,3}(\\.\\d{1,3}){3}$";
	//String pattern = "^25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9](\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])){3}$";
	//String pattern = "^25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]$";
	
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
        in.close();
    }

}

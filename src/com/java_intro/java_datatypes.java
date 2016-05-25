package com.java_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java_datatypes {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
        try
        {
        	int num = sc.nextInt();
        	for (int i=0; i< num; i++){
	            long x=sc.nextLong();
	            System.out.println(x+" can be fitted in:");
	            if(x>=-128 && x<=127)System.out.println("* byte");
	            if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
	            if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
	            if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
	        }    
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }
        sc.close();
	}

}

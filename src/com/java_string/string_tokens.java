package com.java_string;

import java.util.Scanner;

public class string_tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Usually you will use tokenize() or split() using
		pattern of delimiter like “ “ or “,” or “:”
		this denim is regular expression pattern
		*/
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string: ");
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

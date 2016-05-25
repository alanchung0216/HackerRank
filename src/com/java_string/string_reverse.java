package com.java_string;

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

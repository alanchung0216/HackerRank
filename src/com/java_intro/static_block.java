package com.java_intro;

import java.util.Scanner;

public class static_block {

		// TODO Auto-generated method stub
	static Scanner sc;   
    static int B;
    static int H;
    static boolean flag = false;       
    static {
    	System.out.println("enter height:");
        sc = new Scanner(System.in);   
        B = sc.nextInt();
       	System.out.println("enter breadth:");        
        H = sc.nextInt();
        if (B <= 0 || H <= 0){
           System.out.println("java.lang.Exception: Breadth and height must be positive"); 
        } else flag=true;
    }
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}


}

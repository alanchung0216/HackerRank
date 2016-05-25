package com.java_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java_loop {
// a+b*2^n
// a+b*2^0, a+b*2^0 + b*2^1, ... , ...+ b*2^(n-1)
// input
//	2
//	0 2 10
//	5 3 5
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
        //Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i<num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int total = a + 1*b; // initial condition
            System.out.printf("%d ",total);
            for (int j=1; j<n; j++) {
                total += Math.pow(2,j)*b; // power of 2
                System.out.printf("%d ",total); 
            }
            System.out.printf("%n"); // print \n
        }
        sc.close();

	}

}

package com.java_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/java-loops
	
// a+b*2^n
// a+b*2^0, a+b*2^0 + b*2^1, ... , ...+ b*2^(n-1)
// input
//		2
//		0 2 10
//		5 3 5
/*
 In this problem you will test your knowledge of Java loops. 
 Given three integers , , and , output the following series:

Input Format

The first line will contain the number of testcases t. 
Each of the next  lines will have three integers, , , and .

Constraints:

Output Format

Print the answer to each test case in separate lines.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation

In the first case: 0 2 10

1st term=0+1*2=2
2nd term=0+1*2+2*2=6
3rd term=0+1*2+2*2+4*2=14

 */

public class java_loop {	
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

package com.algorithms_warmup;

import java.util.Scanner;

public class diagonal_difference {
/*
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing  space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12

Sample Output

15

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		int n = sc.nextInt();
		int[][]	two_d_a= new int[n][n];
		int f_diag=0;
		int b_diag=0;
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				two_d_a[i][j] = sc.nextInt();
				if (i==j) f_diag += two_d_a[i][j];
				if (i==n-j-1) b_diag += two_d_a[i][j];
			}
		}
		int val = f_diag-b_diag;
		System.out.println(val >= 0 ? val : -val);
		
	}

}

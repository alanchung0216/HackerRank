package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one_d_jump {
	public static void main(String[] args) {	
		File file = new File(args[0]);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int t = sc.nextInt();
		while (t != 0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] ia = new int[n];
			for (int i=0; i < ia.length; i++){
				ia[i] = sc.nextInt();
			}
			// can I win
			boolean win = false;
			for (int i=0; i<ia.length; i++){
				if (ia[i] == 0) {
					// try jump or walk
					if ((i+m) >= ia.length) {
						win = true;
						break;
					} 
					else if (ia[i+m] == 0) {
						i = i+m-1;
					}
					else if (ia[i+1] == 1) {
						break; // lose
					}
				} else break; // lose
			}
			System.out.println((win) ? "YES" : "NO");

			t--;
		}
	}
}


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
	        while (t > 0){
	            int len = sc.nextInt();
	            int jump = sc.nextInt();
	            boolean win = false;
	            int[] ia = new int[len];
	            for (int i = 0; i < len; i++) {
	                ia[i] = sc.nextInt();
	            }
	            for (int i=0; i < len; i++) {
	                if (ia[i] == 0){
	                    if ((i+1 >= len) || (i+jump >= len))  {                      
	                        win = true;
	                        break;
	                    }
	                    if (ia[i+jump] == 0) {
	                        i = i+jump-1;
	                    }
	                } else {
	                    break;
	                }                   
	            }
	            System.out.println((win == true) ? "YES" : "NO");
	            t--;
	        }
	}
}


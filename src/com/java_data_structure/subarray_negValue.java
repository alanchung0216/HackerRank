package com.java_data_structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subarray_negValue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        File file = new File(args[0]);
        Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int n = sc.nextInt();
        int[] ia = new int[n];
        for (int i=0; i<ia.length; i++){
            ia[i] = sc.nextInt();
        }
        //int max = ia[0];
        
        int count = 0;
        
        for (int i=0; i<ia.length; i++){
        	int sub_sum=0;
            for (int j=i; j<ia.length; j++){
                sub_sum += ia[j];
                if (sub_sum < 0) {
                    count++;
                    //max = sub_sum;
                }
            }
        }
        System.out.println(count);
    
    }
}

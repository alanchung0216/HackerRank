package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList_contain_intArray {

	public static void main(String[] args) {
		File file = new File(args[0]);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	        int n = sc.nextInt();
	        List<Integer[]> x = new ArrayList();
	        
	        for (int i=0; i< n; i++){
	            int len = sc.nextInt();
	            Integer[] ia = new Integer[len];
	            for (int j=0; j<len; j++){
	                ia[j] = sc.nextInt();
	            }
	            x.add(ia);
	        }
	        int q = sc.nextInt();
	        for (int i=0; i<q; i++){
	            int qx = sc.nextInt();
	            int qy = sc.nextInt();
	            // do query
	            if ((x.get(qx-1).length == 0) || (x.get(qx-1).length < qy)) {
	                System.out.println("ERROR!");
	            } else {
	                System.out.println(x.get(qx-1)[qy-1]);
	            }

	        }
	}
}
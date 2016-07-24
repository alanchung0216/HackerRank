package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		File file = new File(args[0]);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int lines = sc.nextInt();
		//sc.nextLine();
		List<Integer[]> lia = new ArrayList<Integer[]>();
		while (lines !=0){
			int n = sc.nextInt();
			Integer[] ia = new Integer[n];
			for (int i=0; i<n; i++){
				ia[i] = new Integer(sc.nextInt());
			} 
			lia.add(ia);
			//sc.nextLine();
			lines--;
		}
		//System.out.println("size "+lia.size());
		int q = sc.nextInt();
		//sc.nextLine();
		while (q !=0){
			int x = sc.nextInt();
			int y = sc.nextInt();
			//System.out.println("x "+x + " y "+ y);
			//System.out.println("x length "+lia.get(x-1).length);
			// find x and y
			if ((x < 1) || (x > 5)) System.out.println("ERROR!");
			else if ((y > lia.get(x-1).length)) System.out.println("ERROR!");
			else {
				System.out.println(lia.get(x-1)[y-1]);
			}
			//sc.nextLine();
			q--;
		}

	}
}
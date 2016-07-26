package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;
// copy this answer from Editor
public class deque_hashmap_unique_pairs {
/*
Sample Input

6 3
5 3 5 2 3 2

Sample Output - max is three unique numbers

3

 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int n = in.nextInt();
		int m = in.nextInt();
		int ans = 0, distinct = 0;
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			//5 3 5 2 3 2
			deque.addLast(num);// 5 3 5 2 3 2
			if (hashmap.get(num) == null) hashmap.put(num,0);
			// <5 0>- <3 0>- <2 0>-
			
			hashmap.put(num, hashmap.get(num)+1);
			// <5 1>- <3 1>- <5 2> <2 1>- <3 2> <2 2>
			
			if (hashmap.get(num)==1) distinct++; // 1 2 3
			
			// 1, 2, 3, 4
			if (deque.size() == m+1){
				int ele = deque.removeFirst(); // 5 3 5
				hashmap.put(ele, hashmap.get(ele)-1);// <5 1> <3 1> <5 0>
				if (hashmap.get(ele) == 0) distinct--; // 2
			}
			if (deque.size() == m){
				if (distinct > ans) ans = distinct; // ans 2, 3,
			}
		   
		}
		System.out.println(ans); // ans is 3
		in.close();
	}

}

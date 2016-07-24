package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap_phonebook {

	public static void main(String[] args) throws FileNotFoundException {
	 /*
	3
	uncle sam
	99912222
	tom
	11122222
	harry
	12299933
	uncle sam
	uncle tom
	harry
	
	
uncle sam=99912222
Not found
harry=12299933
	*/
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		Map<String, Integer> pb = new HashMap<String, Integer>();
		int t = sc.nextInt();
		sc.nextLine();
		while (t != 0){
			String name = sc.nextLine();
			Integer num = sc.nextInt();			
			pb.put(name, num);
			sc.nextLine();
			t--;
		}
		while (sc.hasNext()){
			String q = sc.nextLine();
			Integer val=pb.get(q.trim()); 
			if (val != null) {
				System.out.println(q+"="+val);
			} else 
				System.out.println("Not found");
			
		}
		sc.close();

	}

}

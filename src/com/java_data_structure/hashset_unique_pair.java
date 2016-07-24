package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output

1
2
2
3
3
 */

public class hashset_unique_pair {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
        Scanner s = new Scanner(file);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> hs = new HashSet<String>();
        for (int i=0; i<t; i++){
            hs.add(new String(pair_left[i]+" "+pair_right[i]));           
            System.out.println(hs.size());          
        }
        s.close();
	}
}

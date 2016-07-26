package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.Scanner;

public class bitset_AndOrSetFlip {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		5 4
		AND 1 2
		SET 1 4
		FLIP 2 2
		OR 2 1
		*/
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        File file = new File(args[0]);
		        Scanner sc = new Scanner(file);
		        int n = sc.nextInt();
		        BitSet B1 = new BitSet(n);
		        BitSet B2 = new BitSet(n);
		        for (int i=0; i<n; i++){
		            B1.clear(i);
		            B2.clear(i);
		        }
		        int cmds = sc.nextInt();
		        //BitSet<Integer> bs = new BitSet<Integer>();
		        while (cmds != 0) {
		            String cmd = sc.next();
		            int num1 = sc.nextInt();
		            int num2 = sc.nextInt();
		            switch (cmd) {
		                case "AND":
		                    if (num1 == 1)
		                        B1.and(B2);
		                    else
		                        B2.and(B1); 
		                    break;
		                case "SET":
		                    if (num1 == 1)
		                        B1.set(num2);
		                    else
		                        B2.set(num2);
		                    break;
		                case "FLIP":
		                    if (num1 == 1)
		                        B1.flip(num2);
		                    else
		                        B2.flip(num2);
		                    break;
		                case "OR":
		                    if (num1 == 1)
		                        B1.or(B2);
		                    else
		                        B2.or(B1); 
		                    break;                
		            }
		            int count1=0;
		            int count2=0;
		            for (int i=0; i<n; i++){
		                if (B1.get(i)) count1++;
		                if (B2.get(i)) count2++;
		            }
		            System.out.println(count1+" "+count2);
		            cmds--;
		        }
		        sc.close();
		        
	}

}

package com.algorithms_implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlock_square {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test; i++){
            int beg = sc.nextInt();
            int end = sc.nextInt(); 

            // this will improve performance
            //Basically Its a math formula to find number of squares 
            //in a given range. We do the floor of larger number sqrt and 
            //ceiling of smaller number sqrt. Reason being we need to find 
            //number of integers between the sqrt of those numbers.
            
            int count = (int)(Math.floor(Math.sqrt(end))
                              - Math.ceil(Math.sqrt(beg)))+1;
            
            /* this will work but many test cases timeout 
            int count=0;
            for (int j=beg; j<=end; j++){
                int sqrt=(int) Math.sqrt(j);
                if (sqrt*sqrt == j) count++;
            }
            */
            System.out.println(count);
        }
        sc.close();
    }
}

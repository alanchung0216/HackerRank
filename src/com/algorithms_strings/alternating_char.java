package com.algorithms_strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class alternating_char {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            String str = sc.nextLine();
            //System.out.println(str);
            
            char pre=str.charAt(0);
            int count=0;
            for (int j=1; j< str.length(); j++){
                if (pre == str.charAt(j)){
                    count++;
                }
                else {
                    pre=str.charAt(j);
                }
            }
            System.out.println(count);
            
        }
        sc.close();
    }
}

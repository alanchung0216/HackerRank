package com.algorithms_strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char[] ca = str.toUpperCase().toCharArray();
        int[] count = new int[26];
        for (int i=0 ; i<ca.length; i++){
            if ((ca[i] >= 'A' ) && (ca[i] <= 'Z')){
                count[ca[i]-'A']++;
            }
        }
        boolean flag=false;
        for (int i=0; i<26; i++){
            if (count[i] == 0) {
                flag=true;
            }
        }
        System.out.println((flag)? "not pangram" : "pangram");
        sc.close();
    }
}

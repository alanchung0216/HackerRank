package com.algorithms_implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class angry_professor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0) {
                    k--;
                    //System.out.println(k);
                }
       
            }
            System.out.println(k>0?"YES":"NO");            
        }
    }

}

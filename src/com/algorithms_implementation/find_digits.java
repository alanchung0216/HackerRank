package com.algorithms_implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class find_digits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count=0;
            String str = Integer.toString(n);
            for (int i=0; i < str.length(); i++){
                if (Character.getNumericValue(str.charAt(i)) == 0) continue;
                else {
                    if (n % Character.getNumericValue(str.charAt(i)) == 0) count++;
                }
            }
            System.out.println(count);
        }
    }

}

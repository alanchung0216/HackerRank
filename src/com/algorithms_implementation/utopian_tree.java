package com.algorithms_implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class utopian_tree {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int high=1;
            for (int i=1; i<=n ; i++){
                if ((i % 2) == 1) high *= 2;
                else high += 1;
            }
            System.out.println(high);
        }
    }
}

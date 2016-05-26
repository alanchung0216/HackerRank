package com.algorithms_warmup;

import java.io.*;
import java.util.*;

public class staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i < num; i++){
            for (int j=0; j < num; j++){
                if (j >= (num-i)-1) {
                    System.out.printf("#");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("%n");
        }
    }
}

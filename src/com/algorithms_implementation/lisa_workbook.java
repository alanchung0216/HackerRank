package com.algorithms_implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lisa_workbook {

    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt(); // chapters
        int npp = sc.nextInt(); // max number problem per page
        int pn=0;  // page number
        int count=0;
        for (int i=1; i <= ch; i++){
            int maxp = sc.nextInt();  // problems in chapter
            pn++;
            for (int p = 1; p <= maxp; p++){
                if (pn == p) count++;  // found it !!!
                if (((p % npp) == 0) && (p < maxp)) pn++; // this is the key to move next page#           
            }                       
        }
        System.out.println(count); //print the special number that is same as page number
        sc.close();
    }

}

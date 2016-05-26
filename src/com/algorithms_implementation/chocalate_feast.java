package com.algorithms_implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class chocalate_feast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int wrapper=0;
            int wrapper_yield= 0;
            int wrapper_remain= 0;
            int num = n/c;
            wrapper=num;
            while (wrapper >= m){
                wrapper_yield = wrapper/m;               
                wrapper_remain = wrapper%m;
                num += wrapper_yield;
                wrapper = wrapper_yield + wrapper_remain;
            }
            //num += m_num + (m_num+m_rem)/m;
            System.out.println(num);           
        }
        in.close();
    }
}

package com.algorithms_implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cut_sticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            //System.out.println(arr[arr_i]);
        }
        
        List<Integer> ll = new ArrayList<Integer>();
        for (int i=0; i < arr.length; i++ ){
            ll.add(arr[i]);
            //System.out.println(arr[i]);
        }
        Collections.sort(ll);
 
        for (int i=0; i < ll.size(); i++){
            if (ll.get(0) == 0) {
                ll.remove(0);
                i=-1; // set it back so we can start from 0 index again
                continue;
            }           
            System.out.println(ll.size());           
            int small = ll.get(0);
            for (int j=0; j < ll.size(); j++){
 
                ll.set(j, ll.get(j) - small);  
               //System.out.println("cut operation " + ll.get(j));                
            }
        }       
    }

}

package com.algorithms_warmup;
import java.io.*;
import java.util.*;

public class time_conversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int hr=0;
        int min=0;
        int sec=0;
        boolean am=true;
        String line=sc.nextLine();
        //System.out.println("line "+line);
        String[] str = line.split(":");
        hr = Integer.parseInt(str[0]);
        min = Integer.parseInt(str[1]);
        
        //for (int i=0; i < str.length; i++){
           // System.out.println(str[i]);
           
        //}
        String str1 = str[2].substring(0,2);
        sec = Integer.parseInt(str1);
        String str2 = str[2].substring(2,4);
        //System.out.println(str2);
        if ((str2.compareTo("AM") == 0) && (hr==12)){
            hr=0;
        } else if ((str2.compareTo("PM") == 0) && (hr != 12)) {
            hr += 12;
            //System.out.println(str2);
        }
        //min=sc.nextInt();
        System.out.printf("%02d:%02d:%02d",hr,min,sec);
    }
}

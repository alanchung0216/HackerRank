package com.algorithms_warmup;
import java.io.*;
import java.util.*;

public class Plus_Minus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int neg=0;
        int pos=0;
        int zero=0;
        int num = sc.nextInt();
        //sc.nextLine();
        for (int i=0; i< num; i++) {
            int input=sc.nextInt();
            if (input < 0) neg++;
            else if (input > 0) pos++;
            else zero++;
        }
        //System.out.printf("%s %d ","pos ",pos);
        double dp=(double) pos/num;
        double dn=(double) neg/num;
        //float dz=zero/num;
        System.out.printf("%.6f%n",dp);
        System.out.printf("%f%n",dn); // default to 6 position
        System.out.printf("%.6f%n",(double) zero/num);
    }

}

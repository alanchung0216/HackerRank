package com.java_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java_eof {

	public static void main(String[] args) throws FileNotFoundException{
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
        //Scanner sc = new Scanner(System.in);
        int count=0;
        while (sc.hasNext() == true){
            count++;
            System.out.println(count + " " + sc.nextLine());
        }
        sc.close();
	}
}

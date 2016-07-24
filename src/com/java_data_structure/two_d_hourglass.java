package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class two_d_hourglass {
	

	public static void main(String[] args) {
	
	      
	   //int max = 9*7*-1; // should be good enough
		int max = Integer.MIN_VALUE;

		int sum=0;
		File file = new File(args[0]);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int arr[][]= new int[6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				sum= (arr[i][j]+arr[i][j+1]+arr[i][j+2]
							+arr[i+1][j+1]
					+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);


				if(sum>max)
				{
					max=sum;

				}
			}
		}
		System.out.println(max);
	}
}

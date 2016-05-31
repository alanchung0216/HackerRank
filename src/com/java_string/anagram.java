package com.java_string;

// https://www.hackerrank.com/challenges/java-anagrams
/*
Two strings  and  are called anagrams if they consist same characters, 
but may be in different orders. So the list of anagrams of CAT 
are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

Given two strings, print "Anagrams" if they are anagrams, 
print "Not Anagrams" if they are not. 
The strings may consist at most 50 english characters, the comparison 
should NOT be case sensitive.

This exercise will verify that you are able to sort the 
characters of a string, or compare frequencies of characters.

Sample Input 1

anagram
margana

Sample Output 1:

Anagrams

Sample Input 2

anagramm
marganaa

Sample Output 2:

Not Anagrams

 */
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
/*
	Two strings A & B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".
	We can use sort() both strings and compare them.
	we can se collections.sort() or Arrays.sort(). 
	we choose latter.
*/
	   static boolean isAnagram(String A, String B) {
	      //Complete the function
	       String AU = A.toUpperCase();
	       String BU = B.toUpperCase();
	       char[] ca = AU.toCharArray();
	       char[] cb = BU.toCharArray();
	       Arrays.sort(ca);
	       Arrays.sort(cb);
	       String sca = new String(ca);
	       String scb = new String(cb);
	       if (sca.compareTo(scb) == 0) return true;
	       return false;
	   
	   }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter first string: ");
	        String A=sc.next();
	        System.out.println("enter second string to check anagram: ");	        
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        sc.close();
	    }

}

package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class stack_parentheses {
/*
{}()
({()})
{}(
[]
 */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			Stack<Character> lc = new Stack<Character>();
			String input=sc.next();
			for (int i=0; i<input.length(); i++){
				lc.push(input.charAt(i));
			}
			Stack<Character> temp = new Stack<Character>();

			while (!lc.empty()){
				// pop and compare the top
				// if match then
				char c = lc.pop();
				switch (c){
				case ')' :
					if (lc.peek() == '('){
						lc.pop();
						while (!temp.empty()) lc.push(temp.pop());
					} else
						temp.push(c);
					break;
				case ']' :
					if (lc.peek() == '['){
						lc.pop();
						while (!temp.empty()) lc.push(temp.pop());
					} else
						temp.push(c);
					break;
				case '}' :
					if (lc.peek() == '{'){
						lc.pop();
						while (!temp.empty()) lc.push(temp.pop());						
					} else
						temp.push(c);
					break;

				default :
					temp.push(c);
					break;
				}
			}
			System.out.println(temp.empty() ? "true" : "false");
		}
	}
}

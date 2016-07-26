package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Student implements Comparator<Student> {
	int id;
	String fname;
	double gpa;
	Student(int id, String fname, double gpa){
		this.id = id;
		this.fname = fname;
		this.gpa = gpa;
	}
	Student() { };
	public int compare(Student s1, Student s2){
		if (s1.gpa == s2.gpa){
			//if (s1.fname.compareTo(s2.fname) == 0){ //ok
			if (s1.fname.equals(s2.fname)) {
				return s1.id - s2.id; // order by id
			} else {
				return s1.fname.compareTo(s2.fname); // order by name
			}			
		} else {
			return (int) (s2.gpa*100 - s1.gpa*100); // descending
		}		
	}
}
public class sort_gpa_name_id {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		int t = sc.nextInt();
		Student[] sa = new Student[t];
		for (int i=0; i<t; i++){
			int id = sc.nextInt();
			String name = sc.next();
			double gpa = sc.nextDouble();
			sa[i] = new Student(id,name,gpa);
		}
		Arrays.sort(sa,new Student());
		for (Student s:sa){
			System.out.println(s.fname);
		}

	}

}

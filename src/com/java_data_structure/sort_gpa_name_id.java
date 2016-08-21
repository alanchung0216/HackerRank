package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// question was asked to compare the Student Object
// the below is good.
// three ways.
// 1. use comparator, and Arrays.sort(array, new Student())
// 2. use comparator, and Collections.sort(ArrayList, new Student())
// 3. use comparable, and Collections.sort(ArrayList). 
	// we can use #3 because all we compare
	// are int, double and String and they are based on compareTo and equals for nature order. 
	// if the compare is not based on nature order then this comparable may not be sufficient

/* # 1
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
         if (s2.cgpa > s1.cgpa)
               return 1;
          else
               return -1;
                  
           return (int) (s2.cgpa*100 - s1.cgpa*100);       // may have problem with decimal point 
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
*/
/* # 2
import java.util.*;

class Student implements Comparator<Student> {
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
    public Student(){}
    
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   public int compare(Student s1, Student s2){
       if (s1.cgpa == s2.cgpa) {
           if (s1.fname.equals(s2.fname)){
               return s1.id - s2.id;               
           } else
               return s1.fname.compareTo(s2.fname);           
       } else 
          if (s2.cgpa > s1.cgpa)
               return 1;
          else
               return -1;
                  
           return (int) (s2.cgpa*100 - s1.cgpa*100);       // may have problem with decimal point 
   }
}

//Complete the code
public class sort_gpa_name_id
{
   public static void main(String[] args) throws FileNotFoundException{
      //Scanner in = new Scanner(System.in);
		File file = new File(args[0]);
		Scanner in = new Scanner(file);      
      int num = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(num>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         num--;
      }
        Collections.sort(studentList,new Student());
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
*/
// # 3
import java.util.*;

class Student implements Comparable<Student> {
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
    public Student(){}
    
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   public int compareTo(Student s1){
       if (this.cgpa == s1.cgpa) {
           if (this.fname.equals(s1.fname)){
               return this.id - s1.id;               
           } else
               return this.fname.compareTo(s1.fname);           
       } else 
           if (s1.cgpa > this.cgpa)
               return 1;
          else
               return -1;
          //return (int) (s2.cgpa*100 - s1.cgpa*100);     // may have problem with decimal point   	   
               
   }
}

//Complete the code
public class sort_gpa_name_id
{
   public static void main(String[] args) throws FileNotFoundException{
      //Scanner in = new Scanner(System.in);
		File file = new File(args[0]);
		Scanner in = new Scanner(file);      
      int num = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(num>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         num--;
      }
        Collections.sort(studentList);
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}



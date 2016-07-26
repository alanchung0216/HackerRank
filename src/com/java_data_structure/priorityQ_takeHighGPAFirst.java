package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Student1 {
    private int token;
    private String fname;
    private double cgpa;
    public Student1(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 s1, Student1 s2) {

        double cgpa1 = s1.getCgpa();
        double cgpa2 = s2.getCgpa();

        if(cgpa1 == cgpa2){
            int fnameCom = s1.getFname().compareTo(s2.getFname());
            if(fnameCom==0){
                return s1.getToken()-s2.getToken(); 
            }
            return fnameCom;
        }

        return (cgpa1<cgpa2)?1:(cgpa1>cgpa2?-1:0);
    }

}

public class priorityQ_takeHighGPAFirst {
    public static void main(String[] args) throws FileNotFoundException{
    	File file = new File(args[0]);
        Scanner in = new Scanner(file);
        int totalEvents = Integer.parseInt(in.nextLine());

        Queue<Student1> studentPQ = new PriorityQueue<Student1>(10, new StudentComparator());
        while(totalEvents>0){
            String event = in.next();
            if(event.equals("ENTER")){
                String fname = in.next();
                double cgpa = in.nextDouble();
                int token = in.nextInt();

                Student1 st = new Student1(token, fname, cgpa);
                studentPQ.add(st);
            }
            else if(event.equals("SERVED")){
                studentPQ.poll();
            }
            totalEvents--;
        }
        in.close();
        boolean flag=true;
        while(!studentPQ.isEmpty()){
            Student1 st = studentPQ.poll();
            System.out.println(st.getFname());
            flag=false;
        }
        if(flag){
            System.out.println("EMPTY");
        }
    }
}
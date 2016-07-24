package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Query {
	String cmd;
	List<Integer> lx; 
	Query(String cmd, List<Integer> lx){
		this.cmd = cmd;
		this.lx = lx;
	}
}
public class linkedlist_insert_delete {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*5
12 0 1 78 12
2
Insert
5 23
Delete
0
*/
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        LinkedList<Integer> li = new LinkedList<Integer>();
        for (int i=0; i<n; i++){
            li.add(sc.nextInt());
        }
        //for (int i:li){ System.out.println("li "+i);}
        int qn = sc.nextInt();
        List<Query> ql = new ArrayList<Query>();
        //System.out.println("qn  "+qn);
        sc.nextLine();
        while (qn != 0) {
            String cmd = sc.nextLine();
            //System.out.println("command "+cmd);
            List<Integer> al = new ArrayList<Integer>();
            while (sc.hasNextInt()) {
                al.add(sc.nextInt());
            }
            //for (int i:al){System.out.println("command int "+i);}
            ql.add(new Query(cmd,al));
            if (sc.hasNextLine()) {
            	sc.nextLine();
            	qn--;
            }else break;
        }
        for (Query i:ql){
            switch (i.cmd){
                case "Insert":
                    int ix = i.lx.get(0);
                    int value = i.lx.get(1);
                    li.add(ix,value);
                    break;
                case "Delete":
                	int dx = i.lx.get(0);
                	li.remove(dx);
            }
        }
        for (int i=0; i<li.size(); i++){
        	if (i == li.size()-1)
        		System.out.println(li.get(i));
        	else
        		System.out.printf("%d ", li.get(i));
        }
        sc.close();
    }
}

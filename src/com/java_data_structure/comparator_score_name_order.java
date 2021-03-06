package com.java_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {
	
	public int compare(Player a, Player b){
		if (a.score == b.score){
			return a.name.compareTo(b.name);
		} else {
	        if (b.score > a.score) 
	            return 1;
	        else
	            return -1;	
	        
	        //return b.score - a.score; // OK too
		}
	}
	
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class comparator_score_name_order {

    public static void main(String[] args) throws FileNotFoundException {
    	File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i=0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
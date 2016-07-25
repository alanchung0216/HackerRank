package com.java_advance;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

interface Food {
	String getType();
}

class Cake implements Food {
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}
class Pizza implements Food {
	public String getType() {
		return "Someone ordered Fast Food!";
	}
}

class FoodFactory {
	public Food getFood(String order){
		// note if (order == "cake") would not work
		// because String is OBJECT so the "order" is reference
		// (address) of the OBJECT. "==" simply means compare 
		// the reference if "order" is on the same address of
		// literal "cake".
		// in this case they will not be the same address.
		// in order to compare the 
		// content of order. you must use equals().
		// you should user "cake".equals(order) instead of
		// order.equals("cake") because if order is null 
		// then you will get NullPointerExceptions.
		
		// Off topic: Continue discussion on String.
		// In theory, since order String is OBJECT (not primitive)
		// it can work for call by value environment. Means you can
		// modify the content of the OBJECT and return the value
		// back to the caller. However Java make String
		// immutable (private final value and no setter methods etc)
		// so you can only return String for the caller.
		
		// Why mskr String immutable ? because String is a good choice
		// for KEY to use
		// for HASHMAP and HASHSET since we don't want KEY accidently
		// modified so Java make it immutable.
		
        if ("cake".equals(order)){
            return new Cake();
        } else if ("pizza".equals(order)){
            return new Pizza();
        } else return null;
	}
}
public class design_pattern_factory {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		
		FoodFactory ff = new FoodFactory();
		
		Food order = ff.getFood(sc.nextLine());
		System.out.println("The factory returned "+order.getClass());		
		System.out.println(order.getType());		
		while (sc.hasNextLine()){
			order = ff.getFood(sc.nextLine());			
			System.out.println("The factory returned "+order.getClass());		
			System.out.println(order.getType());
		}


		sc.close();		
	}
}

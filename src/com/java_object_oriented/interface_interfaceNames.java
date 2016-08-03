package com.java_object_oriented;

import java.util.Scanner;

interface Test{
	int test();	
}
interface AdvancedArithmetic{
	  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic, Test{
    public int divisor_sum(int n){
        int total = 0;
        for (int i=1; i <=n; i++ ){
            if (n % i == 0)
                total += i;
        }
        return total;
    }
    public int test() { 
    	return 1;
    }
}
public class interface_interfaceNames {

	public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: \n");
        ImplementedInterfaceNames(my_calculator);
        System.out.println("\nEnter any number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

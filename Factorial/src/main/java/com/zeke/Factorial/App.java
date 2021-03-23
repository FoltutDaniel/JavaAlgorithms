package com.zeke.Factorial;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Give number(integer): ");
    	int n = new Scanner(System.in).nextInt();
    	System.out.println(Factorial(n));
    }
    
    public static int Factorial(int n) {
    	if(n == 1)
    		return n;
    	return n*Factorial(n-1);
		
	}
}

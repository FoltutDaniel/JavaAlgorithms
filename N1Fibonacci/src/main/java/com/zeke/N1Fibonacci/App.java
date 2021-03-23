package com.zeke.N1Fibonacci;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Fn = Fn-1 + Fn-2
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int n;
        System.out.println( "Give the Fibonacci element position(int): " );
        
       Scanner scanner = new Scanner(System.in);
       n = scanner.nextInt();
		System.out.println("FibTR("+n+")= " + FibTR(n));
		System.out.println("FibIt("+n+")= " + FibIt(n));
		
    }
    
    public static int FibTR(int n) { //Fibonacci Tail Recursion
    	if(n == 1 || n==2) {
    		return 1;
    	}
    	
    	return FibTR(n-1) + FibTR(n-2);
    }
    
    public static int FibIt(int n) { //Fibonacci Iterative
    	if(n == 1 || n==2) {
    		return 1;
    	}
    	
    	int fib1 = 1; int fib2 = 1; int fibn = 0;
    	for(int i = 2; i< n;i++) {
    		fibn = fib2+fib1;
    		fib1=fib2;
    		fib2=fibn;
    	}
    	return fibn;
    	
    }
}

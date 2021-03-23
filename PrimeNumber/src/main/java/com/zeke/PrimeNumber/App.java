package com.zeke.PrimeNumber;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean isPrime(int n) {
		
		if(n < 2 || n%2 == 0 && n!=2)
			return false;
		for(int i = 3; i*i <= n; i = i+2) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
    public static void main( String[] args )
    {
    	int n;
        System.out.println( "Give the number to verify(int): " );
        
       Scanner scanner = new Scanner(System.in);
       n = scanner.nextInt();
		if(isPrime(n) == true) {
			System.out.println("Number "+n+" is prime.");
		}else {
			System.out.println("Number "+n+" is not prime.");
		}
    }
}

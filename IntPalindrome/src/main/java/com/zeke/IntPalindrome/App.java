package com.zeke.IntPalindrome;

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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPalindrome(n));
    }
    
    public static boolean isPalindrome(int n) {
    	int n1 = n;
    	int n2 = 0;
    	while(n1 != 0) {
    		n2 = n2*10 + n1 % 10;
    		n1 = n1 / 10;
    	}
    	if(n == n2)
    		return true;
    	return false;
    	
    }
    
}

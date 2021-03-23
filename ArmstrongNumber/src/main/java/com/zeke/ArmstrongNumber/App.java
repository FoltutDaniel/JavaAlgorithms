package com.zeke.ArmstrongNumber;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number(integer): ");
        n = scanner.nextInt();
        System.out.println(isArmstrongNr(n));
    }
    
    public static boolean isArmstrongNr(int n) {
    	double arm = 0; int n1 = n;
    	while(n1 != 0) {
    		arm =  arm + Math.pow((double)n1 % 10,3);
    		n1 = n1 / 10;
    	}
    	if(arm == n)
    		return true;
    	return false;
    }
}

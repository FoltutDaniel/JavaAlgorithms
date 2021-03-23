package com.zeke.DrawPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        printTriangle(5);
        printTree(5);
    }
    
    public static void printTriangle(int base) {
    	for(int i = 0 ;i < base ; i++) {
    		for(int j = 0; j< i; j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
    
    public static void printTree(int base) {
    	for(int i = 0; i < base; i++) {
    		for(int j = 0; j < base - i; j++) {
    			System.out.print(" ");
    		}
    		for(int k = 0; k < i; k++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
}

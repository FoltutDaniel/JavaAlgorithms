package com.zeke.StringPalindrome;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	String str = "";
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Give the string to check: ");
    	try {
			str = br.readLine();
		} catch (IOException e) {
			System.out.println("IOException");
		}
    	System.out.println(isPalindromeI(str));
    	System.out.println(isPalindromeR(str));
    }
    public static boolean isPalindromeI(String str) {
		
    	String str2 = "";
    	for(int i = str.length()-1; i >= 0; i--) {
    		str2 = str2 + str.charAt(i);
    	}
    	if(str.equals(str2)) {
    		return true;
    	}else {
    		return false;
    	}
    	
	}
    
    public static String getReverse(String str) {
    	if(str == null || str.isEmpty())
    		return str;
    	
    	return str.charAt(str.length()-1) + getReverse(str.substring(0,str.length()-1));
    }
    
    public static boolean isPalindromeR(String str) {
    	String str2 = getReverse(str);
    	if(str.equals(str2)) {
    		return true;
    	}
    	return false;
    	
    }
}

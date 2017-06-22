package com.hr.appleNorange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/apple-and-orange
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        validate(s);
        validate(t);
        validate(a);
        validate(b);
        validate(m);
        validate(n);        
        
        if (!( a < s && s < t && t < b )){
        	throw new InputMismatchException("Value not within expected limits");
        }
        
        int countApple = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if (isInsideHouse(s, t , a, apple[apple_i]))
            	countApple++ ;
        }
        
        int countOrange = 0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if (isInsideHouse(s, t , b, orange[orange_i]))
            	countOrange++ ;
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }
    
    private static void validate(int s){
    	if ( 1 > s || s > 100000 )
    		throw new InputMismatchException("Value beyond limits: " + s);
    }
    
    private static boolean isInsideHouse(int start , int end, int posTree, int posFall){
    	return (posTree + posFall) >= start && (posTree + posFall) <= end; 
    }
}
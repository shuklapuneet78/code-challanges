package com.hr.challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/mini-max-sum
public class MinMax {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }        
        long sum = 0;
        for (int i : arr){
        	sum += i;
        }        
        long min = -1;
        long max = -1;
        boolean isFirstLoop = true;
        
        for (int i : arr){
        	if ( isFirstLoop){
        		isFirstLoop = false;
        		max = sum - i;
        		min = max;
        	} else {
        		if ( sum - i > max)
        			max = sum -i;
        		if ( sum - i < min)
        			min = sum -i;
        	}
        }
        System.out.println( min + " " + max);
    }
}

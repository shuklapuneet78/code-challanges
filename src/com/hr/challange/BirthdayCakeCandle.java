package com.hr.challange;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/birthday-cake-candles
public class BirthdayCakeCandle {
    static int birthdayCakeCandles(int n, int[] ar) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        
        for (int h : ar){
        	if (h == max)
        		cnt++;
        	else if (h > max){
        		cnt = 1;
        		max = h;
        	}
        		
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
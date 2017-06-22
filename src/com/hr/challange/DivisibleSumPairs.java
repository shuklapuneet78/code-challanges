package com.hr.challange;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/divisible-sum-pairs
public class DivisibleSumPairs {
	
	static int divisibleSumPairs(int n, int k, int[] ar) {
        int cnt = 0;
        
        for( int x = 0 ; x < n - 1; x++){
        	for( int y = x + 1 ; y < n ; y++){
        		if(isSumDivisble(ar[x] + ar[y], k))
                	cnt++;
        	}
        }
		return cnt;
    }
	
	static boolean isSumDivisble (int sum, int div ){
		return (sum % div == 0);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}

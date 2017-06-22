package com.hr.grading;

/*
 * https://www.hackerrank.com/challenges/grading
 */

public class GradingStudents {

	public static void main(String[] args) {
		
		int[] score = {11, 38, 33 , 67, 73, 99};		
		solve(score);
	}

	static int[] solve(int[] grades){
		int n = grades.length;
		int[] ret = new int[grades.length];
		int idx = 0;
		
		if ( n < 1 || n > 60)
			throw new UnsupportedOperationException("Count of students is not in range : 1 <= n <= 60");
		// Read the grades and round-off as per rules
		for ( int score : grades){
			validateGrades(score);
			int r = roundOffScore(score);
			System.out.println("Original Score: " + score + " => New Scroe : " + r);
			ret[idx++] = r;
		}		
		return ret; 
	}
	
	private static void validateGrades(int i) throws UnsupportedOperationException {		
			if ( i < 0 || i > 100)
				throw new UnsupportedOperationException("Grade is not in range : 1 <= n <= 100 -> " + i);
	}
	
	private static int roundOffScore (int i){
		if (i < 38){
			//System.out.println("Failing score: " + i);
			return i;
		}
		
		if (i >= 38 && (i % 5) >= 3){
			System.out.println("Round the grade: " + i);
			return roundMe(i);
		}
		
		return i;
	}
	
	private static int roundMe(int i){
		for ( ; ; i++){
			if ( i % 5 == 0)
				return i;
		}
	}
}
package com.hr.challange;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		boolean matches = false;
		
		if ( (x1 > x2 ) || (x2 > x1 && v2 > v1)){
			// can't match as x2 will always be ahead
		} else {
			long pos1 = 0;
			long pos2 = 0;
			
			for ( long i = 1 ; i <= Integer.MAX_VALUE ; i++){
				pos1 = (long)x1 + (long)(v1) * i;
				pos2 = (long)x2 + (long)(v2) * i;
				if (pos1 == pos2 ){
					matches = true;
					break;
				}
			}
		}
		
		return matches ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int sum = 0;
		try {
			
			
			for(int s : arr) {
				sum += s;
			}
			return sum;
		}
		catch(NullPointerException e) {
			return 0;
		}
	
		
		
	}
}

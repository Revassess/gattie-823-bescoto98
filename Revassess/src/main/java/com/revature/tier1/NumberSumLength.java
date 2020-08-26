package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		
		StringBuilder numStr = new StringBuilder();
		
		numStr.append(num);
		
		String number = numStr.toString();
		
		int numLength = number.length();
		int sum = 0;
		
		for(int i =0; i<number.length(); i++) {
			
			int temp = Integer.parseInt(String.valueOf(number.charAt(i)));
			
			temp = (int) Math.pow(temp, numLength);
			
			sum += temp;
			
		}
		
		return sum==num;
	}
}

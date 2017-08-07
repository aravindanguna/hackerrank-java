/**
 * @(#)OnceInATram.java Jul 22, 2017 6:27:39 PM
 *
 * Copyright 2017 . All Rights Reserved.
 *
 * This software is the proprietary information of Financial Software & Systems (P) Ltd.
 * Use is subject to license terms.
 */
package org.ag.hackerrank.java.week34;

import java.util.Scanner;

/**
 * @author <a href="aravindan.guna@gmail.com">Aravindan G.</a>
 * @since
 * @version 1.0
 * @created date: Jul 22, 2017 6:27:39 PM
 */
public class OnceInATram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		String result = returnLuckyNumber(input);
		
		System.out.println(result);
	}

	private static String returnLuckyNumber(int input) {
		
		int leftValue = 0;
		
		int rightValue = 0;


		input++;
		
		//System.out.println(input);
		
		String strings = String.valueOf(input);
		
		final int[] ints = new int[strings.length()];
		for (int i = 0; i < 3; i++) {
			leftValue += Integer.parseInt(strings.charAt(i)+"");
		}
		
		for (int i = 3; i < 6; i++) {
			rightValue += Integer.parseInt(strings.charAt(i)+"");
		}
		
		//System.out.println(leftValue +"\t"+ rightValue);
				
		if (leftValue == rightValue )
			
			return input + "";
		else 
			return returnLuckyNumber(input) + "";
		
		
		//return input;
	}

}

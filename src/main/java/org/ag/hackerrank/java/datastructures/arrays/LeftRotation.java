/**
 * @(#)LeftRotation.java Aug 15, 2017 8:28:18 PM
 *
 * Copyright 2017 . All Rights Reserved.
 *
 */
package org.ag.hackerrank.java.datastructures.arrays;

import java.util.Scanner;

/**
 * @author <a href="aravindan.guna@gmail.com">Aravindan G.</a>
 * @since
 * @version 1.0
 * @created date: Aug 15, 2017 8:28:18 PM
 * 
 * 
 * reference - https://www.hackerrank.com/challenges/array-left-rotation
 */
public class LeftRotation {

	static int[] leftRotation(int[] a, int d) {
		
		int[] result =  null;
		
		while(d>0) {
			
			result =  new int[a.length];
			
			for (int i=0;i<a.length-1;i++){
				
				result[i] = a[i+1];
			}
			
			result[a.length-1] = a[0];
			

			
			a = result;
			
			d--;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}

}

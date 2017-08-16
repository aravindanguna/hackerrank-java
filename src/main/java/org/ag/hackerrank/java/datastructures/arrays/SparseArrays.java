/**
 * @(#)SparseArrays.java Aug 15, 2017 7:20:09 PM
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
 * @created date: Aug 15, 2017 7:20:09 PM
 * 
 * Reference : https://www.hackerrank.com/challenges/sparse-arrays
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int queries = scan.nextInt();
		
		String[] n1Strings = new String[queries];
		
		for (int i=0;i<queries;i++) {
			
			n1Strings[i] = scan.next();
		}
		
		queries = scan.nextInt();
		
		String[] n2Strings = new String[queries];
		
		for (int i=0;i<queries;i++) {
			
			n2Strings[i] = scan.next();
		}
				
		
		scan.close();

		for (String value : n2Strings) {
			
			int count = 0;
			
			for (String firstArrayValue : n1Strings) {
				
				if (firstArrayValue.equals(value)) {
					count += 1;
				}
			}
			System.out.println(count);
		}
	}
}

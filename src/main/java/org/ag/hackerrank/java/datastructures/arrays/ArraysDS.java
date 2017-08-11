/**
 * @(#)ArraysDS.java Aug 10, 2017 7:20:00 PM
 *
 * Copyright 2017 . All Rights Reserved.
 * 
 * 
  An array is a type of data structure that stores elements of the same type in a contiguous block of memory. 
  In an array, A, of size N, each memory location has some unique index, i (where 0 <= i < N ), that can be referenced as  A[i]
  (you may also see it written as Ai).

Given an array, A, of N  integers, print each element in reverse order as a single line of space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer, N (the number of integers in A). 
The second line contains N space-separated integers describing A.

Constraints

Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1
 *
 */
package org.ag.hackerrank.java.datastructures.arrays;

import java.util.Scanner;

/**
 * @author <a href="aravindan.guna@gmail.com">Aravindan G.</a>
 * @since
 * @version 1.0
 * @created date: Aug 10, 2017 7:20:00 PM
 * 
 * https://www.hackerrank.com/challenges/arrays-ds
 */
public class ArraysDS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int noOfInput = scan.nextInt();
		
		int[] inputArray = new int[noOfInput];
		
		for (int i=0;i<noOfInput;i++) {
			inputArray[i] = Integer.parseInt(scan.next());
		}
		
	
		for (int j=inputArray.length-1;j>=0;j--) {
			System.out.print(inputArray[j]+" ");
		}
		
		System.out.println();
				
		scan.close();

	}

}

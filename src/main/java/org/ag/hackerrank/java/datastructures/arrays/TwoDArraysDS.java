/**
 * @(#)TwoDArraysDS.java Aug 10, 2017 10:06:14 PM
 *
 * Copyright 2017 . All Rights Reserved.
 *
 */
package org.ag.hackerrank.java.datastructures.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="aravindan.guna@gmail.com">Aravindan G.</a>
 * @since
 * @version 1.0
 * @created date: Aug 10, 2017 10:06:14 PM
 */
public class TwoDArraysDS {
	
	static List store = new ArrayList();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] firstBlock = new int[6];
		int[] secondBlock = new int[6];
		int[] thirdBlock = new int[6];
		int[] fourthBlock = new int[6];
		int[] fiveBlock = new int[6];
		int[] sixthBlock = new int[6];
		
		for (int i=0;i<6;i++) {
			
			firstBlock[i] = Integer.parseInt(scan.next());
		}

		for (int i=0;i<6;i++) {
			
			secondBlock[i] = Integer.parseInt(scan.next());
		}

		for (int i=0;i<6;i++) {
			
			thirdBlock[i] = Integer.parseInt(scan.next());
		}

		
		for (int i=0;i<6;i++) {
			
			fourthBlock[i] = Integer.parseInt(scan.next());
		}

		for (int i=0;i<6;i++) {
			
			fiveBlock[i] = Integer.parseInt(scan.next());
		}

		
		for (int i=0;i<6;i++) {
			
			sixthBlock[i] = Integer.parseInt(scan.next());
		}
		
		calculateHourGlass(firstBlock, secondBlock, thirdBlock);
		calculateHourGlass(secondBlock, thirdBlock, fourthBlock);
		calculateHourGlass(thirdBlock, fourthBlock, fiveBlock);
		calculateHourGlass(fourthBlock, fiveBlock, sixthBlock);
		
		Collections.sort(store);
		
		System.out.println(store.get(store.size()-1));
		
		scan.close();
	}

	private static void calculateHourGlass(int[] firstBlock, int[] secondBlock, int[] thirdBlock) {
		
		int hourGlass = 0;
		
		int i = 0;
		int j = i + 3;
		int k = i + 1;
		int temp_i = i;
		
		do {
		
			for (;temp_i<j;temp_i++) {
				hourGlass += firstBlock[temp_i] + thirdBlock[temp_i];			
			}
			
			//System.out.println(hourGlass + secondBlock[k]);
			
			store.add(hourGlass + secondBlock[k]);
			
			
			i++;
			j = i + 3;
			k = i + 1;
			temp_i = i;
			hourGlass = 0;
		}
		while (i < 4);
	}
}

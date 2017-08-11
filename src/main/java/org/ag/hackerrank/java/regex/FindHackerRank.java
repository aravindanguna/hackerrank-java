/**
 * 
 */
package org.ag.hackerrank.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author gunaseka
 *
 */
public class FindHackerRank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		int noOfCase = scan.nextInt();

		for (int i = 0; i <= noOfCase; i++) {
			
			String input = scan.nextLine();

			//System.out.println("Comes here :: "+input);
			list.add(input);
		}

		findHackerRank(list);

		scan.close();

	}

	private static void findHackerRank(List<String> list) {
		
		
		for (String value : list) {
			
			if (!value.trim().equals("")) {
			
				if (value.matches("hackerrank")) {
					System.out.println("0");
				}	
				else if (value.matches(".*hackerrank")) {
					System.out.println("2");
				}			
				else if (value.matches("hackerrank.*")) {
					System.out.println("1");
				}
				else {
					System.out.println("-1");
				}
			}

		}		
	}
}

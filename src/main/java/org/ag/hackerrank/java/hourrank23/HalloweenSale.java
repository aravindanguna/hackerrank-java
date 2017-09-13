/**
 * @(#)HalloweenSale.java Sep 9, 2017 11:06:11 AM
 */
package org.ag.hackerrank.java.hourrank23;

import java.util.Scanner;

/**
 * @author <a href="aravindan.guna@gmail.com">Aravindan G.</a>
 * @since
 * @version 1.0
 * @created date: Sep 9, 2017 11:06:11 AM
 */
public class HalloweenSale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int d = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int answer = howManyGames(p, d, m, s);
		System.out.println(answer);
		in.close();
	}

	static int howManyGames(int p, int d, int m, int s) {

		int totalGames = 0;

		int dollarsSpent = 0;
		
		int _p = p;
		
		while (_p <= s) {
		
			dollarsSpent = p - d;
			
			if (dollarsSpent <= m) {
				
				dollarsSpent = m;
			}
			
			_p += dollarsSpent;
			
			p = dollarsSpent;
			
			totalGames++;
		}

		return totalGames;
	}
}

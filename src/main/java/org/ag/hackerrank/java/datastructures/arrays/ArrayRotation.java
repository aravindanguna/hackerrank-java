/**
 * 
 */
package org.ag.hackerrank.java.datastructures.arrays;

/**
 * @author gunaseka
 *
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] a = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		int[][] b = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[j][a.length-1-i] = a[i][j];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {			
				System.out.print(b[i][j]);
			}
			System.out.println();
		}		
	}
}

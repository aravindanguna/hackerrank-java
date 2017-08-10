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
public class ValidPANFormat {
	
	//<char><char><char><char><char><digit><digit><digit><digit><char>
	
	//1. First Option
	//public static final String PAN_REGEX_PATTERN = "[A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z]";
	
	//2. Second Option
	public static final String PAN_REGEX_PATTERN = "[A-Z]{5}[0-9]{4}[A-Z]";
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		int noOfCase = scan.nextInt();
		
		for(int i=0;i<noOfCase;i++) {
			
			list.add(scan.next());
		}
		
		printValidPAN(list);
		
		scan.close();
	}

	private static void printValidPAN(List<String> list) {
		
		for (String pan : list) {
			
			System.out.println(pan.matches(PAN_REGEX_PATTERN) ? "YES" : "NO");
		}
		
	}
}

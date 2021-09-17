package com.revature.poassignments;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Decimal: ");
		int decimal = scan.nextInt();
		StringBuilder octal = new StringBuilder("");
		
		while (decimal != 0) {
			int newDecimal = decimal / 8;
			int remainder = decimal % 8;
			octal.insert(0, remainder);
			decimal = newDecimal;
		}
		System.out.println("Octal: " + octal);
		scan.close();
	}
}

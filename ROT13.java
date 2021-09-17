package com.revature.poassignments;

import java.util.Scanner;

public class ROT13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder encrypted = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			int asci = (int) str.charAt(i);
			int encryptedAsci = asci;
			
			if (asci >= 65 && asci <= 90) {
				encryptedAsci += 13;
				if (encryptedAsci > 90) {
					encryptedAsci -= 26;
				}
			}
			if (asci >= 97 && asci <= 122) {
				encryptedAsci += 13;
				if (encryptedAsci > 122) {
					encryptedAsci -= 26;
				}
			}
			encrypted.append((char) encryptedAsci);
		}
		System.out.println(encrypted);
		scan.close();
	}
}

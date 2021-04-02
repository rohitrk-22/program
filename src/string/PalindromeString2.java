package string;

import java.util.Scanner;

public class PalindromeString2 {

	public static void main(String[] args) {
		String s = "wohitw";
		String rev = "";
		char[] charr1 = s.toCharArray();
		for (int i = charr1.length - 1; i >= 0; i--) {
			rev += charr1[i];
		}
		if (rev.equals(s)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("not palimdrome");
		}
	}
}

package string;

import java.util.Scanner;

public class ReverseString3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string:");
		String s = sc.next();

		System.out.println("Input string : " + s);
		char[] charArr = s.toCharArray();
		int charCount = 0;
		int vovelsCount = 0;
		int consolentsCount = 0;

		System.out.println("Vovels present in given strings are :");
		for (int i = charArr.length - 1; i >= 0; i--) {
			charCount++;

if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u') {
				System.out.print(charArr[i] + ",");
				vovelsCount++;
			} else {
				consolentsCount++;
			}
		}
		System.out.println("\nCharacters count is : " + charCount);
		System.out.println("vovels count is : " + vovelsCount);
		System.out.println("Consolents count is : " + consolentsCount);
		sc.close();
	}
}

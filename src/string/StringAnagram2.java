package string;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string :");
		String s1 = sc.nextLine();
		s1 = s1.replaceAll(" ","");
		System.out.println("s1: " + s1)	;	
		s1 = s1.toLowerCase();
		System.out.println("s1: " + s1);
		//System.out.println("First String: " + s1);

		System.out.println("Enter second string :");
		String s2 = sc.nextLine();
		s2 = s2.replaceAll(" ","");
		System.out.println("s2: " + s2)	;	
		s2 = s2.toLowerCase();
		System.out.println("s2: " + s2);
		
		//System.out.println("Second String: " + s2);

		char[] charArr1 = s1.toCharArray();
		Arrays.sort(charArr1);

		char[] charArr2 = s2.toCharArray();
		Arrays.sort(charArr2);

		boolean flag = Arrays.equals(charArr1, charArr2);

		if (flag) {
			System.out.println("Strings are anagram!!");
		} else {
			System.out.println("Strings are not anagram!!");
		}
		sc.close();
	}
}

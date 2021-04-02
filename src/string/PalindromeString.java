package string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string:");
		String s = sc.next();
		
		System.out.println("String : "+s );
		char[] charr1 = s.toCharArray();
		String rev = "";
		
		for(int i = charr1.length - 1; i>=0; i--)
		{
			rev += charr1[i];
		}
		
		if(s.equals(rev))
		{
			System.out.println(s +" : is palindrome");
		}
		else
		{
			System.out.println(s +" : is not palindrome");
		}
	}
}

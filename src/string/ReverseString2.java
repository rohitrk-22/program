package string;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string:");
		String s = sc.next();
		
		System.out.println("String : "+s );
		char[] charArr = s.toCharArray();
		
		System.out.print("String after reverse: ");
		for(int i = charArr.length - 1; i>=0; i--)
		{
			System.out.print(charArr[i]);
		}
		
		sc.close();
	}

}

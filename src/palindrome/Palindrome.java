package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc1.nextInt();
		int num1 = num;
		int reverse = 0;
		System.out.println("Before reversing : "+ num);
		
		while(num != 0)
		{
			int digit = num % 10;
			reverse = (reverse * 10) + digit;
			num /= 10;
		}

		System.out.println("After reversing : "+ reverse);
		
		if(num1 == reverse)
		{
			System.out.println(num1 +" is palindrome number");
		}
		else
		{
			System.out.println(num1 +" is not palindrome number");
		}
		
		sc1.close();
	}
}

package reversenumber;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc1.nextInt();
		int reverse = 0;
		System.out.println("Before reversing : "+ num);
		
		while(num != 0)
		{
			int digit = num % 10;
			reverse = (reverse * 10) + digit;
			num /= 10;
		}

		System.out.println("After reversing : "+ reverse);
	
	}

}

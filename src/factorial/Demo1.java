package factorial;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Factorial");
		int limit = sc.nextInt();
		
		for(int i = 1 ; i <=  limit; i++)
		{
			factorial *= i; 
		}

		System.out.println("Factorail of "+ limit +" is "+factorial);
		sc.close();
	}

}

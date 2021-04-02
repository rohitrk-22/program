package fabonacii;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int a = 0;
		int  b = 1;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Fabonacii series");
		int limit = sc.nextInt();
		
		for(int i = 1 ; i <=  limit; i++)
		{
			System.out.print(a +",");
			c = a +b;
			a = b;
			b = c;
		}

		sc.close();
	}

}

package perfectnumber;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");

		int num = scan.nextInt();

		System.out.println("Divisors are :");
		for (int i = 1; i <= (num -1); i++) {
			if (num % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}

		if (num == sum)
			System.out.println(num + " is perfect number.");
		else
			System.out.println(num + " is not perfect number.");

		scan.close();
	}
}

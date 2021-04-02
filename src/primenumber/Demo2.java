package primenumber;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {

		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");

		int num = scan.nextInt();

		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2)
			System.out.println(num + " is prime number.");
		else
			System.out.println(num + " is not prime number.");

		scan.close();
	}
}

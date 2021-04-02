package armstrongnumber;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");

		int num = scan.nextInt();
		int temp = num;
		int sum = 0;
		
		while (temp != 0) {
			int digit = temp % 10;
			sum += (digit*digit*digit);
			temp /= 10;
		}

		if (num == sum)
			System.out.println(num + " is Armstrong number.");
		else
			System.out.println(num + " is not Armstrong number.");

		scan.close();
	}
}

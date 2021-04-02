package strong_number;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start limit");
		int start = scan.nextInt();

		System.out.println("Enter end limit");
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			int temp = i;
			int sum = 0;

			while (temp != 0) {
				int digit = temp % 10;
				int fact = 1;
				for (int j = 1; j <= digit; j++) {
					fact *= j;
				}
				temp /= 10;
				sum += fact;
			}

			if (i == sum)
				System.out.println(i + " is strong number.");
		}
		scan.close();
	}
}

package strong_number;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");

		int num = scan.nextInt();
		int temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact *= i;
			}
			temp /= 10;
			sum += fact;
		}

		if (num == sum)
			System.out.println(num + " is strong number.");
		else
			System.out.println(num + " is not strong number.");

		scan.close();
	}
}

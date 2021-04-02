package armstrongnumber;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start limit");
		int start = scan.nextInt();

		System.out.println("Enter end limit");
		int end = scan.nextInt();
		
		for(int j =start; j <= end; j++)
		{	
			int power = new Integer(j).toString().length();
			int temp = j;
			int sum = 0;
			
			while (temp > 0) {
				int digit = temp % 10;
				int exp = 1;
				for(int i=1; i<= power; i++)
				{
					exp *= digit;
				}
				sum += exp;
				temp /= 10;
			}
	
			if (j == sum)
				System.out.println(j + " is Armstrong number.");
		}

		scan.close();
	}
}

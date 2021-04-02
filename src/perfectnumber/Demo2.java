package perfectnumber;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) 
	{
		int sum = 0;
		int count  = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start limit");
		int start = scan.nextInt();
		
		System.out.println("Enter end limit");
		int end = scan.nextInt();

		System.out.println("Perfect numbers between range "
		+start +" to "+end +" are :");
		
		for(int j = start; j <= end; j++)
		{
			for (int i = 1; i < j; i++) 
			{
				if (j % i == 0)
				{
					sum += i;
				}
			}
			if (j == sum)
			{
				count++;
				System.out.print(j + ",");
			}
			sum = 0;
		}
		System.out.println("\nTotal Count of perfect numbers is : "+count);
		scan.close();
	}
}

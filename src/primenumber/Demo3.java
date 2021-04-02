package primenumber;

public class Demo3 {
	public static void main(String[] args) {

		int primeNumberCount = 0;
		int count = 1;

		for(int j = 1; j <= 1000; j++)
		{
			count = 1;
			for (int i = 1; i <= j/2; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			
			if (count == 2)
			{
				System.out.println(j);
				primeNumberCount++;
			}
		}
		
		System.out.println("Prime number count is :"+ primeNumberCount);
	}
}

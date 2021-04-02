package starpattern;

public class Sample_10 {
	public static void main(String[] args) 
	{
		int line = 5;
		int starCount = 1;
		int mid=(line+1)/2;

		for (int i = 1; i <= line; i++) 
		{
			for (int j = 1; j <= starCount; j++) 
			{
				System.out.print("*");
			}

			System.out.println();
			if(i<mid)
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
		}
	}
}

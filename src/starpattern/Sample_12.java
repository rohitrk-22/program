package starpattern;

public class Sample_12 {
	public static void main(String[] args) 
	{
		int line = 5;
		int starCount = 1;
		int spaceCount=2;
		int mid=(line+1)/2;

		for (int i = 1; i <= line; i++) 
		{
			for (int j = 1; j <= spaceCount; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= starCount; k++) 
			{
				System.out.print("*");
			}

			System.out.println();
			if(i<mid)
			{
				starCount++;
				spaceCount--;
			}
			else
			{
				starCount--;
				spaceCount++;
			}
		}
	}
}

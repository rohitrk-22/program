package starpattern;

public class Sample_9 {
	public static void main(String[] args) 
	{
		int line = 5;
		int starCount = 9;
		int spaceCount=0;

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
			starCount=starCount-2;
			spaceCount++;
		}
	}
}

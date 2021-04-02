package missingpattern;

public class Sample13 {

	public static void main(String[] args) {
		
		System.out.println("PS");
		
		int lines = 5;
		int starCount = 9;
		int spaceCount = 0;
		
		for(int i = 1; i <= lines; i++)
		{
			for(int j = 1; j <= spaceCount; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= starCount; k++)
			{
				if( k ==1 || k == starCount || i == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			spaceCount ++;
			starCount -= 2;
			
			System.out.println();
		}
		System.out.println("PE");
	}
}

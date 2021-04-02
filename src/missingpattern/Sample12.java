package missingpattern;

public class Sample12 {

	public static void main(String[] args) {
		
		System.out.println("PS");
		
		int lines = 5;
		int starCount = 1;
		int spaceCount = 4;
		
		for(int i = 1; i <= lines; i++)
		{
			for(int j = 1; j <= spaceCount; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= starCount; k++)
			{
				if( k ==1 || k == starCount || i == lines)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			spaceCount --;
			starCount +=2;
			
			System.out.println();
		}
		System.out.println("PE");
	}
}

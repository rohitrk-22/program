package missingpattern;
public class Sample15 {
	public static void main(String[] args) {
		System.out.println("PS");
		
		int lines = 5;
		int starCount = 1;
		int spaceCount=2;
		int mid = (lines+1)/2;
		
		for(int i = 1; i <= lines; i++)
		{
			for(int l = 1; l <= spaceCount; l++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= starCount; k++)
			{
				if( k ==1 || k == starCount)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			if(i < mid)
			{
				starCount ++;
				spaceCount--;
			}
			else
			{
				starCount --;
				spaceCount++;
			}
			
			System.out.println();
		}
		System.out.println("PE");
	}
}

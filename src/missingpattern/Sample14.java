package missingpattern;
public class Sample14 {

	public static void main(String[] args) {
		
		System.out.println("PS");
		
		int lines = 5;
		int starCount = 1;
		int mid = (lines+1)/2;
		
		for(int i = 1; i <= lines; i++)
		{
			
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
				starCount ++;
			else
				starCount --;
			
			System.out.println();
		}
		System.out.println("PE");
	}
}

package missingpattern;

public class Sample5 {

	public static void main(String[] args) {
		
		System.out.println("PS");
		
		int lines = 5;
		int starCount = 5;
		
		for(int i = 1; i <= lines; i++)
		{
			for(int j = 1; j <= starCount; j++)
			{
				if(i ==1 || i == lines || j == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("PE");
	}
}

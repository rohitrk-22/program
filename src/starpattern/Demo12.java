package starpattern;
public class Demo12 
{
	public static void main(String[] args) {
		System.out.println("Program Started");
		int lines=5;
		int starCount =1;
		int spcaeCount = 2;
		int mid =(lines+1)/2;
	
		for(int i =1;i <= lines; i++)
		{
			for(int k=1;k <=spcaeCount; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j <=starCount; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i <mid)
			{
				starCount++;
				spcaeCount--;
			}
			else
			{
				starCount--;
				spcaeCount++;
			}
		}
		System.out.println("Program Ended");
	}

}

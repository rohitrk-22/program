package starpattern;

public class Demo11 
{
	public static void main(String[] args) {
		System.out.println("Program Started");
		int lines=5;
		int starCount =1;
		int mid =(lines+1)/2;
	
		for(int i =1;i <= lines; i++)
		{
			for(int k=1;k <=starCount; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i <mid)
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
		}
		System.out.println("Program Ended");
	}

}

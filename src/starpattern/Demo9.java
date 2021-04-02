package starpattern;
public class Demo9 {

	public static void main(String[] args) {
		System.out.println("Program Started");
		int lines=5;
		int starCount =5;
		int spcaeCount = 0;
	
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
			
			if(i <=2)
			{
				starCount= starCount-2;
				spcaeCount++;
			}
			else
			{
				starCount = starCount + 2;
				spcaeCount--;
			}
		}
		System.out.println("Program Ended");
	}
}

package starpattern;

public class Demo4 {
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		int lines=5;
		int starCount =5;
		String s = "*";
		for(int i =0;i <=lines; i++)
		{
			for(int j=0;j <starCount; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount--;
		}
		System.out.println("Program Ended");
	}
}

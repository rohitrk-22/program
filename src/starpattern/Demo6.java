package starpattern;

public class Demo6 {
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		int lines=5;
		int spcaeCount = lines-1;
		String s = "*";
		
		for(int i =1;i <= lines; i++)
		{
			for(int k=1;k <=spcaeCount; k++)
			{
				System.out.print(" ");
			}
			
			System.out.println(s);
			
			s = s + "*";
			spcaeCount--;
		}
		System.out.println("Program Ended");
	}
}

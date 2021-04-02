package loop;

public class Demo1_while7 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		
		int lines = 5;
		int starCount = 1;
		String str = "*";
		while(starCount <= lines)
		{
				System.out.println(str);
			starCount++;
			str += "*"; 
		}
		
		System.out.println("Program Ended");
	}
}

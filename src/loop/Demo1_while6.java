package loop;

public class Demo1_while6 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		
		int i = 1;
		while(i<=500)
		{
			if(i%2 != 0)
				System.out.println(i);
			
			i++;
		}
		
		System.out.println("Program Ended");
	}
}

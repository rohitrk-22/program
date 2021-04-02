package breakandconti;

public class Demo1 {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++)
		{
			if(i %3 == 0)
			{
				System.out.println("Fuzz");
				continue;
			}
			else if(i%5 == 0)
			{
				System.out.println("Buzz");
				continue;
			}
			else if(i%3 == 0 && i%5 == 0)
			{
				System.out.println("Fuzz Buzz");
				continue;
			}
		}
	}

}

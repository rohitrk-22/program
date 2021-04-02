package numberpattern;
public class Sample24 {
	public static void main(String[] args) {

		int lines = 5;
		int value=1;
		int numCount = 5;

		for (int i = 1; i <= lines; i++) 
		{
			for (int j = 1; j <= numCount; j++) 
			{
					System.out.print(value);
			}
			System.out.println();
			numCount--;
		}
		}
	}

package numberpattern;
public class Sample22 {
	public static void main(String[] args) {

		int lines = 5;
		int numcount=5;
		int value=1;

		for (int i = 1; i <= lines; i++) 
		{
			for (int j = 1; j <= numcount; j++) 
			{
					System.out.print(value);
			}
			System.out.println();
			value++;
			}
		}
	}

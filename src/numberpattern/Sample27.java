package numberpattern;
public class Sample27 {
	public static void main(String[] args) {

		int lines = 5;
		int mid = (lines + 1)/2;
		int value=1;
		int numCount = 1;

		for (int i = 1; i <= lines; i++) 
		{
			for (int j = 1; j <= numCount; j++) 
			{
					System.out.print(value);
					value++;
			}
			System.out.println();
			value = 1;
			
			if(i < mid)
			{
				numCount++;
			}
			else
			{
				numCount--;
			}
		}
	}
}

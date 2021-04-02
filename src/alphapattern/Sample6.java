package alphapattern;

public class Sample6 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		int value = 1;
		char letter = 'A';
		
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= Count; j++) {
				
				if(i%2 == 1)
				{
				System.out.print(letter);
				}
				else
				{
					System.out.print(value);
				}
				value++;
				letter++;
			}
			
			value = 1;
			letter = 'A';
			Count++;
			
			System.out.println();
		}
	}
}

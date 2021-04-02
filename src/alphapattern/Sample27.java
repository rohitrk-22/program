package alphapattern;

public class Sample27 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		char value = 'A';
		
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= Count; j++) {
				
				if(i%2 == 1)
				{
				System.out.print(value);
				}
				else
				{
					System.out.print("*");
				}
				value++;
			}
			
			value = 'A';
			Count++;
			
			System.out.println();
		}
	}
}

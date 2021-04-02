package alphapattern;

public class Sample5 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		int value = 1;
		
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
			
			value = 1;
			Count++;
			
			System.out.println();
		}
	}
}

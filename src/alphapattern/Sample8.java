package alphapattern;

public class Sample8 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		char letter = 'A';
		
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= Count; j++) {
				
				System.out.print(letter);
				letter++;
			}
			
			letter = 'A';
			Count++;
			
			System.out.println();
		}
	}
}

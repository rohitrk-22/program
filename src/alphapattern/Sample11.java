package alphapattern;

public class Sample11 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 9;
		char letter = 'A';
		int spaceCount = 0;
		
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= spaceCount; j++) {
				
				System.out.print(" ");
			}

			for (int j = 1; j <= Count; j++) {
				
				System.out.print(letter);
				letter++;
			}
			
			letter = 'A';
			Count -=2;
			spaceCount +=1;
			
			System.out.println();
		}
	}
}

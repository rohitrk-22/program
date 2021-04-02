package alphapattern;

public class Sample4 {
	public static void main(String[] args) {
		int lines = 5;
		int charCount = 5;
		char value = 'E';

		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= charCount; j++) {
				System.out.print(value);
				value--;
			}
			value ='E';
			
			System.out.println();
		}
	}
}

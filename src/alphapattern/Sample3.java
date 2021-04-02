package alphapattern;

public class Sample3 {
	public static void main(String[] args) {
		int lines = 5;
		int charCount = 4;
		char value = 'A';

		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= charCount; j++) {
				System.out.print(value);
				value++;
			}
			value ='A';
			
			System.out.println();
		}
	}
}

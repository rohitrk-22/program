package alphapattern;

public class Sample1 {
	public static void main(String[] args) {
		int lines = 5;
		int charCount = 5;
		char value = 'A';

		System.out.println("PS");
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= charCount; j++) {
				System.out.print(value);
			}

			System.out.println();
		}
		System.out.println("PE");
	}
}

package numberpattern;

public class Sample19 {
	public static void main(String[] args) {

		int lines = 5;
		int numCount = 5;
		int value = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= numCount; j++) {
				System.out.print(value);
				value++;
			}
			System.out.println();
			value = 1;
		}
	}
}

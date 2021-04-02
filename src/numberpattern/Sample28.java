package numberpattern;

public class Sample28 {
	public static void main(String[] args) {
		int lines = 5;
		int mid = (lines + 1) / 2;
		int value = 1;
		int spaceCount = 2;
		int numCount = 1;

		for (int i = 1; i <= lines; i++) {
			for (int k = 1; k <= spaceCount; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= numCount; j++) {
				System.out.print(value);
			}
			System.out.println();

			if (i < mid) {
				numCount +=2;
				spaceCount--;
			} else {
				numCount -= 2;
				spaceCount++;
			}
		}
	}
}

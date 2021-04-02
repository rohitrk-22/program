package numberpattern;

public class Sample31 {
	public static void main(String[] args) {
		int lines = 5;
		int mid = (lines + 1) / 2;
		int value = 1;
		int spaceCount = 4;
		int numCount = 1;

		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= numCount; j++) {
					System.out.print(value);
			}

			for (int k = 1; k <= spaceCount; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= numCount; j++) {
				System.out.print(value);
			}

			System.out.println();

			if (i < mid) {
				numCount++;
				spaceCount -= 2;
			} else {
				numCount--;
				spaceCount += 2;
			}
		}
	}
}

package alphapattern;

public class Sample14 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		char letter = 'A';
		int mid = (lines + 1) / 2;
		int spaceCount = 2;

		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= Count; j++) {

				if (j == 1 || j == Count)
					System.out.print(letter);
				else
					System.out.print(" ");

				letter++;
			}

			letter = 'A';

			if (i < mid) {
				spaceCount--;
				Count++;
			} else {
				spaceCount++;
				Count--;
			}

			System.out.println();
		}
	}
}

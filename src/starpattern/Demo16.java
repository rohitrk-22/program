package starpattern;

public class Demo16 {
	public static void main(String[] args) {
		System.out.println("Program Started");
		int lines = 5;
		int starCount = 1;
		int spcaeCount = 4;
		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}

			for (int k = 1; k <= spcaeCount; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}
			System.out.println();

			if (i < mid) {
				starCount++;
				spcaeCount -= 2;
				;
			} else {
				starCount--;
				spcaeCount += 2;
				;
			}
		}
		System.out.println("Program Ended");
	}

}

package missingpattern;
public class Sample18 {
	public static void main(String[] args) {

		int lines = 5;
		int starCount = 1;
		int spaceCount = 4;
		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) 
		{
			for (int k = 1; k <= starCount; k++) {
				if (k == 1 || k == starCount) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int l = 1; l <= spaceCount; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= starCount; m++) {
				if (m == 1 || m == starCount) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i < mid) {
				spaceCount -= 2;
				starCount++;
			} else {
				spaceCount += 2;
				starCount--;
			}
			System.out.println();
		}
	}
}

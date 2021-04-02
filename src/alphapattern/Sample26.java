package alphapattern;
public class Sample26 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		char letter = 'A';
		int mid = (lines + 1) / 2;
		int spaceCount = 4;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= Count; j++) {
				if(j==1 || j==Count)
					System.out.print(letter);
				else
					System.out.print(" ");
				letter++;}

			for (int j = 1; j <= spaceCount; j++) {

				System.out.print(" ");
			}

			letter = 'A';
			for (int j = 1; j <= Count; j++) {
				if(j==1 || j==Count)
					System.out.print(letter);
				else
					System.out.print(" ");
				letter++;	}

			letter = 'A';
			if (i < mid) {
				Count++;
				spaceCount -= 2;
			} else {
				Count--;
				spaceCount +=2;
			}
			System.out.println();
		}
	}
}

package alphapattern;

public class Sample16 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		char letter = 'A';
		int mid = (lines+1)/2;
		int spaceCount = 2;
		
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= Count; j++) {
				
				System.out.print(letter);
			}
			
			if(i < mid)
			{
				spaceCount--;
				Count +=2;
			}
			else
			{
				spaceCount++;
				Count -=2;
			}
			
			System.out.println();
		}
	}
}

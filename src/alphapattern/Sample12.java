package alphapattern;

public class Sample12 {
	public static void main(String[] args) {
		int lines = 5;
		int Count = 1;
		char letter = 'A';
		int mid = (lines+1)/2;
		
		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= Count; j++) {
				
				System.out.print(letter);
			}
			
			if(i < mid)
			{
				Count ++;
			}
			else
			{
				Count --;
			}
			
			System.out.println();
		}
	}
}

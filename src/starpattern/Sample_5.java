package starpattern;

public class Sample_5
{
	public static void main(String[] args) {
	
	int line =5;
	int starCount=5;
	
	
	for(int i =1;i<=line;i++)
	  {
		for(int j =1;j<=starCount;j++) 
		{
			System.out.print("*");
		}
			System.out.println();
			 starCount--;
	  }
	}
}

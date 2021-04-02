package numberpattern;

public class Demo1 {

	public static void main(String[] args) 
	{
		int lines=5;
		int spacecount = 4;
		int numcount=1;
		int num=1;
		 for(int i=1;i<=lines;i++)
		 {
			 for(int j=1;j<=spacecount;j++)
			 {
			 System.out.print(" ");
			 }
			 for(int k=1;k<=numcount;k++)
			 {
				 System.out.print(num);
				 num++;
			 }
			 System.out.println();
			 
			 spacecount--;
			 numcount++;
			 num=1;
		 }

	}
}

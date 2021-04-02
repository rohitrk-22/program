package numberpattern;

public class Demo3 {

	public static void main(String[] args) 
	{
		int lines=5;
		int numcount=1;
		int num=1;
		int mid =(lines+1)/2;
		 for(int i=1;i<=lines;i++)
		 {
			 for(int j=1;j<=numcount;j++)
			 {
			 System.out.print(num);
			 }
			 System.out.println();
			 if(i<mid)
			 {
				 numcount++;
			 }
			 else
			 {
				 numcount--;
			 }
		 }
	}
}

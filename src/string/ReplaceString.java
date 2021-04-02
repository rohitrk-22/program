package string;
public class ReplaceString {

	public static void main(String[] args) 
	{
		String str = "LOVE IS MAVA AND MAVA IS MARJAVA";
		System.out.println(str);
		
		String [] factor =str.split("MAVA");
		for(int i=0;i<=factor.length-1;i++)
		{
			System.out.print(factor[i]);
			if(i!=factor.length-1)
			{
				System.out.print("JAVA");
			}
		}
	}
}

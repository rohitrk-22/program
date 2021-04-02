package breakandconti;

public class Demo4 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		
			if( a == b && b == c)
			{
				System.out.println("All are same ");
			}
			else if(a >= b && a >= c)
			{
				System.out.println("Greatest number is a = "+a);
			}
			else if(b >= c && b >= a)
			{
				System.out.println("Greatest number is b = "+b);
			}
			else 
			{
				System.out.println("Greatest number is c = "+c);
			}
	}

}

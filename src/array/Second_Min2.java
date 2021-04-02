package array;
public class Second_Min2 {

	public static void main(String[] args) 
	{
		int a[] = {11,88,74,2,45,72,98,1,74,45};

		int firstMin = a[0];
		int secondMin = a[0];
		
		for(int i = 0; i<a.length;i++)
		{
			if(firstMin > a[i])
			{
				secondMin = firstMin;
				firstMin = a[i];
			}
			else if(secondMin > a[i])
			{
				secondMin = a[i];
			}
		}
		System.out.println("Smallest element : "+ firstMin);
		System.out.println("Second Smallest element : "+ secondMin);
	}
}

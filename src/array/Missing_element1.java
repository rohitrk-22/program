package array;

public class Missing_element1 {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8};
		int b[] = {1,2,3,4,5,6,8};
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i<a.length;i++)
		{
			sum1 += a[i];
		}
		
		for(int i = 0; i<b.length;i++)
		{
			sum2 += b[i];
		}

		System.out.println("Missing number : "+ (sum1-sum2));
	}

}

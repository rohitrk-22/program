package array;
public class Second_Min4 {
//WAY-2
	public static void main(String[] args) 
	{
		int a[] = {11,88,74,2,45,72,98,1,74,45};
		
		int min = a[0];
		int secondMin = 0;
		int sub = 0;
		
		for(int i :a)
		{
			if(min > i)
				min = i;
		}
		System.out.println("Smallest element = "+ min);
		
		sub = min - a[0];
		
		for(int i : a)
		{
			if((min - i) >= sub && i != min)
			{
				sub = min -i;
				secondMin = i;
			}
		}
		System.out.println("Second Smallest element = "+ secondMin);
	}
}

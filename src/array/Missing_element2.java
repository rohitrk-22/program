package array;

public class Missing_element2 {

	public static void main(String[] args) 
	{
		int a[] = {1,2,4,5,6,7,8};
		int b[] = {1,2,3,4,5,6,8};
		int temp = 0;
		for(int i = 0; i<a.length;i++)
		{
			temp = 0;
			for(int j =0; j <b.length; j++)
			{
				if(a[i] == b[j])
				{
					temp = 0;
					break;
				}
				else
					temp = a[i];
			}
			
			if(temp != 0)
			{
				System.out.println("Missing : "+temp);
			}
		}
	}
}

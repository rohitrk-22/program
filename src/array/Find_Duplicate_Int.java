package array;

public class Find_Duplicate_Int {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,1,2,5};
		
		System.out.println("Duplicates elemets are:"); 
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}

package array;

public class SpiralPattern {

	public static void main(String[] args) {
		
		int startIndex=0;
		int endIndex=4;
		int round=endIndex/2;
		int mid=endIndex/2;
		int [][] arr1 = new int [5][5];
		arr1[mid][mid]=1;
		int number = 25;
		
		for(int i=0; i<round;i++)
		{
			for(int j= startIndex;j<=endIndex;j++)
			{
				arr1[startIndex][j] = number;
				number--;
			}
			
			for(int k= startIndex+1;k<=endIndex;k++)
			{
				arr1[k][endIndex] = number;
				number--;
			}
			
			
		}
		
		for(int i =0; i<endIndex; i++)
		{
			for(int j=0; j< endIndex; j++)
			{
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
		
	}

}

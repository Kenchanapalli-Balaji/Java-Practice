package Arrays.copy;

public class Reverse_Matrix_In_Row_Wise 
{
	public static void main(String[] args) 
	{
		int ar[][]= { {1,2,3},
					  {4,5,6}
					};
		System.out.println("Original Array");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<ar.length;i++)
//		{
//			for(int j=0;j<ar[i].length/2;j++)
//			{
//				int temp=ar[i][j];
//				ar[i][j]=ar[i][ar[i].length-1-j];
//				ar[i][ar[i].length-1-j]=temp;
//			}
//		}
		
		for(int i=0;i<ar.length;i++)
		{
			int start=0;
			int end=ar[i].length-1;
			while(start<end)
			{
				int temp=ar[i][start];
				ar[i][start]=ar[i][end];
				ar[i][end]=temp;
				start++;
				end--;
			}
		}
		
		System.out.println("After reverse Row Wise");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
					
	}
}

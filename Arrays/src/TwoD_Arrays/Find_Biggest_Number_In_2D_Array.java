package TwoD_Arrays;

public class Find_Biggest_Number_In_2D_Array
{
	public static void main(String[] args) 
	{
		int ar[][]= {{1,2,3,4} ,{5,6,7,8}};
		int big=ar[0][0];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
//				if(ar[i][j]>big)
//					big=ar[i][j];
				
				big=big<ar[i][j] ? ar[i][j]:big;
			}
		}
		System.out.println(big);
	}
}

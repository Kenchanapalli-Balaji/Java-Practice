package Arrays.copy;

import java.util.Arrays;

public class Add_Two_Matrix 
{
	public static void main(String[] args)
	{
		int ar1[][]= {  {1,2,3,4,5},
						{6,7,8,9,10}
					 };
		int ar2[][]= {  {1,2,3,4,5},
				        {6,7,8,9,10}
					  };	
		if(ar1.length!=ar2.length||ar1[0].length!=ar2[0].length)
		{
			System.out.println("Not possible to add");
		}
		
	
			int ar3[][]=new int[ar1.length][ar1[0].length];
			for(int i=0;i<ar3.length;i++)
			{
				for(int j=0;j<ar3[i].length;j++)
				{
					ar3[i][j]=ar1[i][j]+ar2[i][j];
				}
			}
		System.out.println(ar1.length+"    "+ar2.length);//rows
		System.out.println(ar1[0].length+"   "+ar2[0].length);//columns
		
		
		for(int i[]:ar3)
		{
			System.out.println(Arrays.toString(i));
		}
				
		
	}
}

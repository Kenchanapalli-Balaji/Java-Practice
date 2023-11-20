package Arrays.copy;

import java.util.Arrays;

class Merge_Two_Arrays
{
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5,1,2};
		int ar2[]= {6,7,8,9,10};
		int res[]=new int[ar1.length+ar2.length];
		for(int j=0;j<res.length;j++)
		{
			for(int i=0;i<ar1.length;i++)
			{
				res[j]=ar1[i];
				j++;
			}
			for (int i = 0; i < ar2.length; i++) 
			{
				res[j] =ar2 [i];
				j++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}


/*
int j=0;
for (int i = 0; i < ar1.length; i++, j++) 
{
	res[j] =ar1 [i];
}
for (int i = 0; i < ar2.length; i++, j++) 
{
	res[j] =ar2 [i];
}
*/
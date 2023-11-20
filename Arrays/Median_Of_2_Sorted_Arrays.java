//https://youtu.be/WQ1STBnmx2w?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Arrays.copy;

import java.util.Arrays;

public class Median_Of_2_Sorted_Arrays
{
//__________________________________________________________________________________
	// Solution 1
	/*
	public static void main(String[] args) 
	{
		int ar1[]= {1,3,8,17};
		int ar2[]= {5,6,7,19,21,25};
		int m[]=new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length)
		{
			if(ar1[i]<ar2[j])
			{
				m[k]=ar1[i];
				i++;
			}
			else
			{
				m[k]=ar2[j];
				j++;
			}
			k++;
		}
		while(i<ar1.length)
		{
			m[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length)
		{
			m[k]=ar2[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(m));
		float median=0;
		if(m.length%2==0)
		{
			median=(float)(m[m.length/2]+m[(m.length/2)-1])/2;
		}
		else
			median=(float)m[m.length/2];
		System.out.println(median);	
	}
	*/
	//_--------------------------------------------------------------------------------
	//Solution 2
	
	
	public static void main(String[] args) 
	{
		int ar1[]= {1,3,8,17};
		int ar2[]= {5,6,7,19,21,25};
		int m[]=new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length && k<=m.length/2)
		{
			if(ar1[i]<ar2[j])
			{
				m[k]=ar1[i];
				i++;
			}
			else
			{
				m[k]=ar2[j];
				j++;
			}
			k++;
		}
		while(i<ar1.length && k<=m.length/2)
		{
			m[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length && k<=m.length/2)
		{
			m[k]=ar2[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(m));
		float median=0;
		if(m.length%2==0)
		{
			median=(float)(m[m.length/2]+m[(m.length/2)-1])/2;
		}
		else
			median=(float)m[m.length/2];
		System.out.println(median);	
	}
	
	
	
	//____________________________________________________________________________________________________________
	//Solution 3:- 
	/*
	public static void main(String[] args) 
	{
		int ar1[]= {1,3,8,17};
		int ar2[]= {5,6,7,19,21,25};
		
		System.out.println(findMedian(ar1,ar2));
	}
	static float findMedian(int ar1[],int[] ar2)
	{
		if(ar2.length>ar1.length)
			return findMedian(ar2, ar1);
		int l=0;
		int h=ar1.length;
		while(l<=h)
		{
			int m1=(l+h)/2;
			int m2=((ar1.length+ar2.length+1)/2)-m1;
			int l1=(m1==0)?Integer.MIN_VALUE :ar1[m1-1];
			int r1=(m1==ar1.length)?Integer.MAX_VALUE:ar1[m1];
			int l2=(m2==0)?Integer.MIN_VALUE:ar2[m2-1];
			int r2=(m2==ar2.length)?Integer.MAX_VALUE:ar2[m2];
			if(l1<=r2 && l2<=r1)
			{
				if((ar1.length+ar2.length)%2==0)
					return (float)(Integer.max(l1,l2)+Integer.min(r1, r2))/2;
				else
					return (float)(Integer.max(l1, l2));
			}
			else if(l2>r1)
				l=m1+1;
			else
				h=m1-1;
		}
		return 0.0f;
		
	}
	*/
}

package Arrays;

import java.util.Arrays;

//public class ReverseArrayElements 
//{
//	
//	
//	public static void main(String[] args) 
//	{
//		int ar[]= {10,20,30,40,50,60,70,80,90};
//		System.out.println("Befor Reverse elements");
//		System.out.println(Arrays.toString(ar));
//		
//		for (int i=0;i<ar.length/2;i++)
//		{
//			int t=ar[i];
//			ar[i]=ar[ar.length-1-i];
//			ar[ar.length-1-i]=t;
//		}
//		System.out.println("After Reverse Elements");
//		System.out.println(Arrays.toString(ar));		
		


//		String st="[";
//		for(int i=0;i<ar.length;i++)
//		{
//			st=st+ar[i];
//			if(i<ar.length-1)
//				st=st+",";
//		}
//		st=st+"]";
//		System.out.println(st);
	
//	}
//}

class ReverseArrayElements
{
	public static void reverse(int ar[],int start,int end)
	{
		while(start<end)
		{
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) 
	{
		int ar[]= {10,20,30,40,50,60,70,80,90};
		System.out.println("Befor Reverse elements");
		System.out.println(Arrays.toString(ar));
		reverse(ar,0,ar.length-1);
		System.out.println("After Reversing");
		System.out.println(Arrays.toString(ar));
	}
}

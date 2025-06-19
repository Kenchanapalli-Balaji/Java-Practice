// https://youtu.be/vKQ6oUH02gw
package Substrings;

public class Permutations_Of_A_String 
{
	public static void fun(char arr[],int fi)
	{
		if(fi==arr.length-1)
		{
			System.out.println(arr);
			return;
		}
		for(int i=fi;i<arr.length;i++)
		{
			swap(arr,i,fi);
			fun(arr,fi+1);
			swap(arr,i,fi);
		}
	}
	public static void swap(char arr[], int i, int fi)
	{
		char temp=arr[i];
		arr[i]=arr[fi];
		arr[fi]=temp;
	}
	public static void main(String[] args) 
	{
		String s="ABC";
		fun(s.toCharArray(), 0);
	}
}

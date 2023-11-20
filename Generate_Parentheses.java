import java.util.Arrays;

//leetcode - 22
//https://youtu.be/lxPLAXhRyDI
public class Generate_Parentheses 
{
	public static void fun(char ar[], int n, int i, int open, int close)
	{
		if(i==ar.length)
			System.out.println(ar);
		if(open<n)
		{
			ar[i]='(';
			fun(ar, n, i+1, open+1,close);
		}
		if(close<open)
		{
			ar[i]=')';
			fun(ar, n, i+1, open, close+1);
		}
	}
	public static void main(String[] args) 
	{
		int n=3;
		char arr[]=new char[n*2];
		fun(arr, n, 0, 0,0);
	}
}


//Second Approach
/*
int n=3;
char res[]=new char[n*2];
for(int i=0;i<res.length/2;i++)
{
	res[i]='(';
}
for(int i=(res.length/2);i<res.length;i++)
{
	res[i]=')';
}
System.out.println(Arrays.toString(res));
*/
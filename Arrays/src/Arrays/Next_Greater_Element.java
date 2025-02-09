//The next greater element is the first element towards right, which is greater then the current element
package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,1};
		int res[]=new int[arr.length];
		
		// Solution 1 :- Using For loops
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					res[i]=arr[j];
					break;
				}
				else
					res[i]=-1;
			}
		}
	
		
		// Solution 2 :- Using Stack 
		/*
		Stack<Integer> stk=new Stack<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(!stk.isEmpty())
			{
				while(!stk.isEmpty() && stk.peek()<=arr[i])
				{
					stk.pop();
				}
			}
			if(stk.isEmpty())
			{
				res[i]=-1;
			}
			else
				res[i]=stk.peek();
			stk.push(arr[i]);
		}
		*/
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}
}

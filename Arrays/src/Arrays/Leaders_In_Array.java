//Leader :- An element is leader , if it is greater than all the elements to its rightside.
//          And the rightmost element is always a leader.
package Arrays;

public class Leaders_In_Array
{
	/*
	public static void main(String[] args)
	{
		int arr[]= {8,11,5,11,7,6,3};
		for(int i=0;i<arr.length;i++)
		{
			boolean is_leader = true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>=arr[i])
				{
					is_leader=false;
					break;
				}
			}
			if(is_leader)
				System.out.println(arr[i]);
		}
	}
	*/
//////////////////////////// Efficient Way ////////////////////////////////////
	
	public static void main(String[] args) 
	{
		int arr[]= {8,11,5,11,7,6,3};
		int current_leader=arr[arr.length-1];
		System.out.println(current_leader);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>current_leader)
			{
				current_leader=arr[i];
				System.out.println(current_leader);
			}
		}
	}
}

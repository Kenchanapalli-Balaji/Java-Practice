// leetcode - 540
// https://youtu.be/AZOmHuHadxQ
/*
 You are given a sorted array consisting of only integers where every 
 element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.
Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
 */
package Binary_Search_With_Arrays;

public class Single_Element_In_A_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,1,2,3,3,4,4,8,8};
		////////////////////// Using Binary Search Algorithm /////////////////////
		
		// Edge cases 
		if(arr[0]!=arr[1]) // checking first element with next element
			System.out.println(arr[0]); 
		if(arr[arr.length-1]!=arr[arr.length-2]) // checking last element with previous one
			System.out.println(arr[arr.length-1]); 
		int low=1;
		int high=arr.length-2;
		while(low<=high)
		{
			int mid=(low+high)/2;
			// If arr[mid] is the single element
			if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
			{
				System.out.println(arr[mid]);
				break;
			}
			 // when We are in the left: left half pair = (even, odd) both have same values
			// if mid index is odd checking with previous one i.e even index
			// if mid index is even checking with next one i.e odd index
			if((mid%2==1 && arr[mid] == arr[mid-1]) ||  
					(mid%2==0 && arr[mid]==arr[mid+1])) 
				// Eliminate the left half:
				low=mid+1;
			// when We are in the right: right half pair = (odd, even) both have same values
			else
				// Eliminate the right half:
				high=mid-1;
		}
		////////////////// Brute Force Approach///////////////////
		/*
		for(int i=0;i<arr.length;i++)
		{
			if(i==0) // for first element
			{
				if(arr[i]!=arr[i+1])
				{
					System.out.println(arr[i]);
					break;
				}
			}
			else if(i==arr.length-1) // for last element
			{
				if(arr[i]!=arr[i-1])
				{
					System.out.println(arr[i]);
					break;
				}
			}
			else // for middle elements checking previous or after elements same or not
			{
				if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		*/
		
		
	}
}

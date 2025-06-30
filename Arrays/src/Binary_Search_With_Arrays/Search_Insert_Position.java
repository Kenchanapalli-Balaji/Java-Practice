// leetcode - 35
/*
 Given a sorted array of distinct integers and a target value, 
 return the index if the target is found. If not, return the index 
 where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
 */
package Binary_Search_With_Arrays;

public class Search_Insert_Position 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,3,5,6};
		int target=5;
		int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);  // return mid;
                break;
            }
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
       System.out.println(low);  // return low;
	}
}

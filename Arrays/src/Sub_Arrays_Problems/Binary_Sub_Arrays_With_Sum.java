// leetcode - 930
// https://youtu.be/XnMdNUkX6VM
/*
 Given a binary array nums and an integer goal, return the number of non-empty 
 subarrays with a sum goal.
A subarray is a contiguous part of the array.

Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
 */
package Sub_Arrays_Problems;

public class Binary_Sub_Arrays_With_Sum 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,0,1,0,1}; int goal=2;
		System.out.println(sum(arr , goal) - sum(arr , goal -1));
	}
		
		//////////////// Brute Force Approach /////////////////
		/*
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0; 
			for(int j=i;j<arr.length;j++){
				sum+=arr[j];
				if(sum==goal)
					count++;
			}
		}
		System.out.println(count);
		*/
		
		//////////////////////// Sliding Window Technique ////////////////////////
		static int sum(int[] arr, int goal)
		{
			int l=0;int r=0;int count = 0;
	        int sum =0;
	        while(r!= arr.length){
	            //if(goal < 0) return 0;
	            sum+= arr[r];
	            while(sum > goal){
	                sum -= arr[l];
	                l++;
	            }
	            count += r-l+1;
	            r++;
	        }
	        return count;
        }
}

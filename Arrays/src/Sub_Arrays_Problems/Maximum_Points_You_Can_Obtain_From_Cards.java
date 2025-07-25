// leetcode - 1423
// https://youtu.be/pBWCOCS636U
/*
 There are several cards arranged in a row, and each card has an associated number of points.
The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. 
You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, 
return the maximum score you can obtain.

Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However,
choosing the rightmost card first will maximize your total score. The optimal strategy is 
to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
 */
package Sub_Arrays_Problems;

public class Maximum_Points_You_Can_Obtain_From_Cards 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,1}; int k=3;
		
		int maxsum=0;
		int lsum=0; int rsum=0;
		for(int i=0;i<k;i++)
		{
			lsum+=arr[i];
		}
		maxsum=lsum;
		int rightIndex=arr.length-1;
		for(int i=k-1;i>=0;i--)
		{
			lsum=lsum-arr[i];
			rsum=rsum+arr[rightIndex];
			rightIndex--;
			maxsum=Math.max(maxsum, lsum+rsum);
		}
		System.out.println(maxsum);
	}
}

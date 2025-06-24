/*
 One day, Fred and his N friends were playing a card game in 
which each player throws a cardwith a 
 number written on it. The cards are such that a number X is written on front of the card, 
 and the negative of that number is written on the back side of the card. 
 This game has the following rules:
 -> Each of the N players is asked to throw a card.After at the N cards are thrown. 
 	Fred has to flip one or more cards in consecutive order , only once.
 -> Your task is to help Fred flip the cards in such a way that the 
 	sum of the numbers, on front face of the cards is the maximum.
 
	Input Specification:
	input1: An integer N denoting the number of cards(1<=N<=500)
	input2: An integer array containing N integer, where the ith integer denotes
	The value on the front of the card(-1000<=input2[i]<=1000)
	Output Specifications:
	Return the maximum sum of the numbers, on the front of the card
 
	Example 1:
	Input1 : 5
	Input2 : -2 3 -1 -4 -2
	Output: 8
	Explanation:
	Since Fred can flip consecutive cards only once, he chooses to flip the last three cards, 
	which results in the maximum sum (-2+3+1+4+2) i.e. 8
	Therefore 8 is returned as the output.
 
	Example 2:
	Input1: 5
	Input2: -1 2 3 4 -5
	Output: 13
	Explanation:
	Since Fred can flip consecutive cards only once, he chooses to flip the last card,
	which results in the maximum sum (-1+2+3+4+5) i.e. 13
	Therefore 13 is returned as the output.
	 
	Input:
	 */
package Arrays;

public class Card_Game 
{
	public static void main(String[] args) 
	{
		int arr[]= {-2,3,-1,-4,-2};
		int min_sum=0;
		int curr_sum=0;
		int sum=0;
		for(int i:arr)
		{
			 sum+=i;
			curr_sum+=i;
			if(curr_sum<min_sum)
				min_sum=curr_sum;
			if(curr_sum>0)
				curr_sum=0;
		}
		int ans=sum+(min_sum*(-2));
		System.out.println(ans);
		
	}
}

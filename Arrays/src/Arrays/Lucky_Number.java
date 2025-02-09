//https://www.youtube.com/watch?v=LhzvH2aOYXE&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=47
package Arrays;

public class Lucky_Number 
{
	public static void main(String[] args) 
	{
		int n=13;
		System.out.println(isLucky(n,2));
	}
	public static boolean isLucky(int n,int counter)
	{
		if(n<counter)
			return true;
		if(n%counter==0) 
			return false;
		return isLucky(n-(n/counter),counter+1);
		
	}
}
/*
 *  condition is n%counter==0  && n<counter
 *  
 -> 1 2 3 4 5 6 7 8 9 10 11 12 13 -----> n=13 & counter =2,   n=n-(n/2)
 -> 1 3 4 7 9 11 13 -----> n=7 & counter =3, n=n-(n/2)
 ->  1 3 7 9 13 ---------> n=5 & counter=4, n=n-(n/2)
 -> 1 3 7 13 ------------> n=4 & counter=5, 
 */

//https://www.youtube.com/watch?v=LhzvH2aOYXE&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=47
package Arrays.copy;

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

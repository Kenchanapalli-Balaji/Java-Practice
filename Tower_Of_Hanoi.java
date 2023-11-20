//https://youtu.be/3aag8Wpv8XM?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
//Rules :-
//1.Only 1 Disk can be moved at a time.
//2.Larger Disk cannot be placed on smaller Disk. 
public class Tower_Of_Hanoi 
{
	public static void main(String[] args) 
	{
		tow(3,'A','B','C');
	}
	public static void tow(int n, char src,char temp, char dest)
	{
		if(n==1)
		{
			System.out.println(n+" Disk move from "+src+"->"+dest);
			return;
		}
		tow(n-1,src,dest,temp);
		//tow(1,src, temp,dest);
		System.out.println(n+" Disk move from "+src+"->"+dest);
		tow(n-1,temp,src,dest);
	}
	
	
	
	
	/*
	public static void tow(int n, char src, char temp, char dest)
	{
		if(n==1)
		{
			System.out.println(src+"->"+dest);
			return;
		}
		tow(n-1,src, dest, temp);
		System.out.println(src+"->"+dest);
		tow(n-1,temp,src,dest);
	}
	*/
}

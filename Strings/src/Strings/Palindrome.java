package Strings;
class Palindrome
{
	public static void main(String[] args) 
	{
		String st="malayalam";
		String res="";
		for (int i=st.length()-1;i>=0;i--)
		{
			res=res+st.charAt(i);
		}
		System.out.println(res);
		if(st.equals(res))
			System.out.println("Palindrome");
		else
			System.out.println("Not Plaindrome");
	}
}

/*
class Palindrome
{
	
	 boolean isPalindrome(String st)
	{
		st=st.toLowerCase();
		int i=0;
		int j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i) !=st.charAt(j))
			    return false;
  			else 
			    i++;
			    j--;	
		}
		return true;
	
	}
	public static void main(String args[])
	{
		Palindrome o=new Palindrome();
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter the String");		
		String st=sc.nextLine();
		
		if(o.isPalindrome(st))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}*/

////////////////////// Using the Recursion Method ///////////////////////
/*
public static boolean isPalindrome(String s, int i, int j)
{
	if(s.charAt(i)!=s.charAt(j))
		return false;
	if(j<=i)
		return true;
	return isPalindrome(s,i+1,j-1);
}
*/



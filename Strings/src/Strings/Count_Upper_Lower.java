package Strings;
import java.util.Scanner;
class Count_Upper_Lower
{
    public static void main(String args[])
	{
		int uc=0;
		int lc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String st=sc.nextLine();
		for(int i=0;i<st.length();i++)
		   {
			//char ch=st.charAt(i);
			if(st.charAt(i)>='A' && st.charAt(i)<='Z') 
			  {
			     uc++;
			  }
			else if(st.charAt(i)>='a' && st.charAt(i)<='z')
			 {
			    lc++;
			 }
		    }
		System.out.println("number of Upper latters in Given String: "+uc);
		System.out.println("number of Lower latters in Given String: "+lc);

	}
}


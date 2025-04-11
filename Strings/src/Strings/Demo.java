package Strings;

public class Demo 
{
	public static void main(String[] args) 
	{String st="AbBCcdefghijklmnopqrstuvwxyz123452";
	int count[]=new int[26];
	
	for(int i=0;i<st.length();i++)
	{
		if(st.charAt(i)>='a' && st.charAt(i)<='z')
			count[st.charAt(i)-97]++;
		else if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			count[st.charAt(i)-65]++;
		
	}
	boolean res=true;
	for(int i=0;i<count.length;i++)
	{
		System.out.println((char)(i+65)+"----->"+count[i]);
		if(count[i]==0)
			res=false;
	} 
	if(res)
		System.out.println("yes");
	else
		System.out.println("no");
		
	}
}

package Strings.copy;
class ComparingTwoStrings
{
	public static void main(String[] args) 
	{
		String st1="Balaji";
		st1=st1.toLowerCase();
		
		String st2="LAJiAb";
		st2=st2.toLowerCase();
		
		int ar1[]=new int[26];
		int ar2[]=new int[26];
		
		for(int i=0;i<st1.length();i++)
		{
			if(st1.charAt(i)>='a' && st1.charAt(i)<='z' )
				ar1[i]=(st1.charAt(i)-97);
		}
		
		for(int i=0;i<st2.length();i++)
		{
			if(st2.charAt(i)>='a' && st2.charAt(i)<='z' )
				ar2[i]=(st1.charAt(i)-97);
				//ar2[st2.charAt(i)-97]++;
		}
		boolean res=true;
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]!=ar2[i])
				res=false;
				
		}
		if(res)
			System.out.println("Yes");
		else
			System.out.println("NO");
	}
	
}
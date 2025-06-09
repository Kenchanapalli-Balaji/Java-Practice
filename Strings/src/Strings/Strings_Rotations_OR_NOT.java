package Strings;

public class Strings_Rotations_OR_NOT 
{
	  // +++++++++++++++++++ Method 1 +++++++++++++++++++
//	public static boolean areRotations(String s1, String s2)
//	{
//		if(s1.length()!=s2.length())
//			return false;
//		s1=s1+s1;
//		return s1.contains(s2);
//		
//	}
	
	
	// +++++++++++++++++++ Method 2u +++++++++++++++++++
	public static boolean areRotations(String s1, String s2)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.equals(s2))
				return true;
			
			char last=s1.charAt(s1.length()-1);
			s1=last+s1.substring(0,s1.length()-1);
			System.out.println(i+"-->"+s1);
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String s1="ABCD";
		String s2="CDAB";
		System.out.println(areRotations(s1,s2));	
	}

}

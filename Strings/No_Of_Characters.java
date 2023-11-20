//Program for number of characters in each WORD and count them
package Strings.copy;

public class No_Of_Characters 
{
	public static void main(String[] args) 
	{
		String st="Rama seetha laxmana";
		String res="";
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				res=res+"-->"+count+"\n";
				count=0;
			}
			else
			{
				count++;
				res=res+st.charAt(i);
			}		
		}
		res=res+"-->"+count;
		System.out.println(res);
		
					//OR//
		
		/*
			 String str="Rama Seetha Laxmana";
			String words[]=str.split("\\s");
			for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]+"---->"+words[i].length());
			}
		
		 */
		 
		
		
/*		
		//program to Count no of words in String
		
		String str="Rama Seetha Laxmana";
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
				count++;
			
		}
		System.out.println("Number of words in a String: "+count);
	*/
	}
}



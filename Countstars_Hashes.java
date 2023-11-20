class Countstars_Hashes
{
	public static void main(String args[])
	{
		String str="###***";
		int count1=0, count2=0;
		//char ch[]=str.toCharArray();
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='*')
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		 
		
		if(count1>count2)
		{
			System.out.println("positive Number");
		}
		else if(count1<count2)
		{
			System.out.println("Negitive Number");
		}
		else
		{
			System.out.println("0");
		}
		
	}
}


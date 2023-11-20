package Numbers;
import java.util.*;

public class Sample 
{
	public static void main(String[] args) 
	{
		String s="RR";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='W')
				count++;
			else
				break;
		}
		System.out.println(count);
	}
}
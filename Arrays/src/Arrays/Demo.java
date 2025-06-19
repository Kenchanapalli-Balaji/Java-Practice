package Arrays;
import java.util.*;

class Demo
{
	public static void main(String[] args) 
	{
		
		String s=  "welcome to the jungle";
		String words[]=s.split("\\s+");
		System.out.println(Arrays.toString(words));
		StringBuilder res=new StringBuilder();
		for(int i=words.length-1;i>=0;i--)
		{
			res.append(words[i]);
			if(i>0)
				res.append(" ");
		}  
         System.out.println(res.toString());
	}	  
}


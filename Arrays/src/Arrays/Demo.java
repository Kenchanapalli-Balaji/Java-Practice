  package Arrays;

import java.util.*;
class Demo
{
	public static void main(String[] args) 
	{
		int n=8;
		int count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n==1)
				break;
			if(n%2==0) {
				n=n/2;
				count++;
			}
			else {
				n=n+1;
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}
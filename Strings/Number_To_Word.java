package Strings.copy;

import java.util.Scanner;

public class Number_To_Word 
{
	
	static String one[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
			  "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
			  "Eighteen","Ninteen"};

	static String two[]= {" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	static void pw(int n,String st)
		{
			if(n<=19)
			 {
				System.out.print(one[n]+" ");
			 }
			else
				System.out.print(two[n/10]+one[n%10]+" ");
			if(n!=0)
				System.out.print(st+" ");
		}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		pw(num/10000000,"crores");
		pw((num/100000)%100,"Lakhs");
		pw((num/1000)%100,"Thousand");
		pw((num/100)%10,"Hundered");
		pw(num%100," ");	
		
	}
}

package numbers;
import java.util.Scanner;
public class Number_To_Word
{
    String one[]={"","one","two","three","four","five","Six","Seven","Eight","Nine","Ten","Eleven",
   "Twelve","thirteen","fourteen","fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};

    String two[]={" "," ","Twenty","thirty","fouty","fifty","Sixty","Sevety","Eighty","ninty"};
     void ntow(int n,String st)
     {
        if(n<20)
           System.out.print(one[n]);
        else
           System.out.print(two[n/10]+one[n%10]);
        if(n!=0)
            System.out.print(st+" ");

      }
  public static void main(String[] args) 
  {
      Number_To_Word o=new Number_To_Word();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
      int n=sc.nextInt();
      o.ntow(n/10000000,"crore");
      o.ntow(n/100000%100,"lakh");
      o.ntow(n/1000%100,"Thousand");
      o.ntow(n/100%10,"hundred");
      o.ntow(n%100," ");
}
}

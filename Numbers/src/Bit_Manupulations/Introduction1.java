package Bit_Manupulations;

public class Introduction1 
{
	public static void main(String[] args) 
	{
		int n=13;  // 1 1 0 1
		int m=7;   // 0 1 1 1
		System.out.println(n&m); // AND Operator -> if both the values are true result is true;
		System.out.println(n|m);//OR Operator->if any of the the value is true then res is true;
		System.out.println(n^m); // XOR Operator -> if both values are same res is false, 
								// and if both are different then res is true; 
		
		
		System.out.println(n>>1); 
		// Right Shift by 1 -> 1 1 0 1. we need to remove last one i.e ->  1 1 0 -> 6
		// Right shift by 2 -> 1 1 0 1. we need to remove last 2 i.e -> 1 1 -> 3
		// Formula is n/2powOf(k)
		
		System.out.println(n<<1); // 1 1 0 1-> becomes 1 1 0 1 0 -> 26
		// Left shift bye 1
	} 
}

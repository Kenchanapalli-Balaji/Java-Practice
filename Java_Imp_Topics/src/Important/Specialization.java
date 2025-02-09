package Important;
/*
 -> Down-Casting(Specialization : Conversion of Non -Primitive data type from higher to 
 			lower. (OR) From super class type to subclass type is called Down-Casting.
 -> Downcasting is possible only with after Up-Casting only. 
 -> In case of up casting using superclass reference we can not access sub class's specific variabvles & Methods.
 
 */
class Vegetable
{
	int price; int qty;
	void wash() {
		System.out.println("Wash the vegetable");
	}
	void chop() {
		System.out.println("Chop the vegetable");
	}
}

class Carrot extends Vegetable
{
	String type = "OOty Carrot";
	 void prepare_Halwa() {
		 System.out.println("Hot ghee carraot Halwa is ready");
	 }
}
public class Specialization 
{
	public static void main(String[] args) {
		Vegetable v = new Carrot(); // Up-Casting
		v.price = 100;
		v.qty = 1;
		v.wash();
		v.chop();
		
		Carrot ct = (Carrot) v; // Down-Casting
		System.out.println(ct.type);
		ct.prepare_Halwa();
	}

}

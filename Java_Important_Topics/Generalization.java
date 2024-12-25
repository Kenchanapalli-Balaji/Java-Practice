/*
 -> Type Casting : Conversion of Datatye from one to other is called Type-Casting.
 -> Generalization ( Up-Casting) : 
 		i) A super class reference referring to any of its sub class object is called up-casting.
 		ii) Conversioin of Non-primitive data type from lower type to Higher type (or)
 			from sub class type to super class type is called up-casting.
 -> -> In case of up casting using superclass reference we can not access sub class's specific variabvles & Methods.
 */

class Engineer {
	void work() {
		System.out.println("Engineer Works");
	}
}
class SWEngineer extends Engineer{
	@Override
	void work() {
		System.out.println("Software Engineer Develops Software Application");
	}
}

public class Generalization {
	public static void main(String[] args) {
		Engineer e = new SWEngineer(); // Up-Casting
		e.work();
	}
}



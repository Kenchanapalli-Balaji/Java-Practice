
/*
 -> In Factory pattern , we dont expose the creation logic to the client and refer the created object 
 	using a standard interface.
 -> The factory pattern also known as Virtual constructor.
 
 Steps:
 ===========
 1). create main class which call factory class.
 2). Factory class returns required class instance.
 */
package Factory_Design_Pattern;
public class Factory_Pattern_Main_Class 
{
	public static void main(String[] args) 
	{
		Profession_Factory profession_Factory = new Profession_Factory();
		Profession doc= profession_Factory.getProfession("Doctor");
		doc.print();
		
	}
}

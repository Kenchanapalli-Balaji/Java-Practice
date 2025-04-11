package Abstarct_Factory_Pattern;

public class Factory_Pattern_Main_Class 
{
	public static void main(String[] args) 
	{
		// first get factory instance from factory factory class , if you want trainees
		Abstract_Factory abstract_Factory = Abstract_Factory_Producer.getProfession(true);
		Profession eng = abstract_Factory.getProfession("Engineer");
		eng.print();
		
	}
}

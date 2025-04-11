package Abstarct_Factory_Pattern;

public class Profession_Abstract_Factory extends Abstract_Factory 
{

	@Override
	public Profession getProfession(String typeOfProfession) 
	{
		if(typeOfProfession==null)
			return null;
		else if(typeOfProfession.equalsIgnoreCase("Engineer"))
			return new Engineer();
		else if(typeOfProfession.equalsIgnoreCase("Teacher"))
			return new Teacher();
		return null;
	}
	
}

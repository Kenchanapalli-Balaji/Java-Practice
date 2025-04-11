package Abstarct_Factory_Pattern;

public class Trainee_Profession_Abstract_Factory extends Abstract_Factory
{

	@Override
	Profession getProfession(String typeOfProfession) 
	{
		if(typeOfProfession==null)
			return null;
		else if(typeOfProfession.equalsIgnoreCase("Teacher"))
			return new Trainee_Teacher();
		else if(typeOfProfession.equalsIgnoreCase("Engineer"))
			return new Trainee_Engineer();
		return null;
	}
	
}

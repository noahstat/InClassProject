
public class Person extends NameHolder 
{

	private String lastName;
	
	public Person() throws NameException
	{
		String temp1 = "Bo";
		String temp2 = "Smith";
		this.lastName = temp2;
		super.setFirstName(temp1);
	}
	
	public Person(String firstName, String lastName) throws NameException
	{
		super.setFirstName(lastName);
		this.lastName = firstName;
	}
	
	@Override
	public String describeSelf()
	{
		String description = "***First Name: " + super.getFirstName() +
				" Last Name: " + lastName + "***";
		return description; //not in life tho!!!
		// TODO Auto-generated method stub

	}

}

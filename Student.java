
public class Student extends Person implements Comparable<Student> {
	
	private static final int INITIAL_RATING = 5;
	private String className;
	private Integer rating;
	
	public Student() throws NameException {
		super();
		rating = INITIAL_RATING;
		// TODO Auto-generated constructor stub
	}
	
	public Student(String firstName, String lastName) throws NameException {
		super(firstName, lastName);
		rating = INITIAL_RATING;
		// TODO Auto-generated constructor stub
	}
	
	public Student(String firstName, String lastName, Integer rating) throws NameException
	{
		super(firstName, lastName);
		this.rating = rating;
	}
	
	@Override
	public int compareTo(Student o) {
		
		int comparison = rating - o.getRating();
		if(comparison < 0)
		{
			return -1;
		}
		else if(comparison > 0)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
		
	}
	
	public Integer getRating()
	{
		return new Integer(rating);
	}
	
	public void setRating(Integer newRating)
	{
		rating = newRating;
	}
}

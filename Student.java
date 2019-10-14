
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
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Integer getRating()
	{
		return new Integer(rating);
	}
	
}

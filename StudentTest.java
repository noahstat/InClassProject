import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private static final int INITIAL_RATING = 5;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testStudent() {
		Student s;
		Integer rating;
		try {
			s = new Student();
			rating = s.getRating();
			Integer expected = INITIAL_RATING;
			assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
	}

	@Test
	public void testSetRating() {

	}

	@Test
	public void testGetRating() {
		try {
			Integer expected = 4;
			Integer rating = expected;
			String firstName = "Alex";
			String lastName = "Bo";

			Student s = new Student(firstName, lastName, rating);
			Integer actual = s.getRating();
			assertEquals(expected, actual);

		} catch (NameException e) {
			fail();
		}

	}

	@Test
	public void testCompareTo() {
		try {
			Student firstStudent = new Student("X", "Y", 2);
			Student secondStudent = new Student("X", "Y", 3);
			
			int actual = secondStudent.compareTo(firstStudent);
			int expected = 1;
			
			assertEquals(expected, actual);
			
			Student tudent = new Student("X", "Y", 5);
			
			actual = secondStudent.compareTo(tudent);
			expected = -1;
			
			assertEquals(expected, actual);
			
		} catch (NameException e) {
			fail();
		}
		
		
		
		
	}

}

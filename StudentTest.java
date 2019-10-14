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
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}

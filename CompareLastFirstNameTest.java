import static org.junit.Assert.*;

import org.junit.Test;

public class CompareLastFirstNameTest {

	@Test
	public void testCompareTo() throws NameException {
		Student firstStudent = new Student("A", "B", 2);
		Student secondStudent = new Student("A", "C", 3);
		Student student = new Student("A", "A", 5);
		Student empty = new Student("Z", "", 2);
		Student secondempty = new Student("x", "", 3);
		boolean result = false;
		
		CompareLastFirstName clfn = new CompareLastFirstName();
		
		clfn.compare(firstStudent, secondStudent);

		
		
	}

}

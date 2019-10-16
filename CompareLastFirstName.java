import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student> {

	public int compare(Student firstStudent, Student secondStudent) {
		String firstName = firstStudent.getFirstName();
		String lastName = firstStudent.getLastName();
		String secondFirstName = secondStudent.getFirstName();
		String secondLastName = secondStudent.getLastName();

		if (firstStudent.getFirstName().compareTo(secondStudent.getFirstName()) < 0) {
			return -1;
		} else if (firstName.compareTo(secondFirstName) == 0) {
			if (lastName.compareTo(secondLastName) < 0)
				return -1;
			else if (lastName.compareTo(secondLastName) == 0)
				return 0;
			else
				return 1;
		} else {
			return 1;
		}
	}

}

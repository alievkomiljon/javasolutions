package DataStructure_April_2017;

import java.util.HashMap;
import java.util.List;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		// implement
		// Key k;
		HashMap<Key, Student> table = new HashMap<Key, Student>();

		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			Key k = new Key(s.getFirstName(), s.getLastName());
			table.put(k, s);
		}
		return table;
	}
}
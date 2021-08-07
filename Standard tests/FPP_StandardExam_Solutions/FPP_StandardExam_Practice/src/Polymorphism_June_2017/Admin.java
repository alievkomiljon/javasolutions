package Polymorphism_June_2017;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Student[] studentArray) {
		/* implement */
		List<Student> list = new ArrayList<>();
		for (Student st : studentArray) {
			list.add(st);
		}
		return list;
	}

	public static double computeAverageGpa(List<Student> studentList) {
		/* implement */
		double totalGpa = 0.0;
		if (studentList.isEmpty())
			return 0.0;
		for (Student s : studentList) {
			totalGpa += s.computegpa();
		}
		return totalGpa / studentList.size();
	}
}
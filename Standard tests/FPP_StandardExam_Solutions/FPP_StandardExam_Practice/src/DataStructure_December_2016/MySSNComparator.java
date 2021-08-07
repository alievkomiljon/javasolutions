package DataStructure_December_2016;

import java.util.Comparator;

public class MySSNComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.getSsn().compareTo(e2.getSsn());

	}

}

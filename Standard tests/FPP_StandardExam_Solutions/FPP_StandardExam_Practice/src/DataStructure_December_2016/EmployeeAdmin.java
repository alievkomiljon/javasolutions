package DataStructure_December_2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		List<Employee> temp = new ArrayList<Employee>();

		Employee emp;
		for (String s : socSecNums) {
			emp = table.get(s);

			if (table.get(s) != null && emp.getSalary() > 80000) {

				// temp.add(table.get(s));
				temp.add(emp);

			}
		}
		return temp;
	}
}

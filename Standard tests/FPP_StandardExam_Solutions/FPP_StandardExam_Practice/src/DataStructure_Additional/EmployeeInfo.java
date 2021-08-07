package DataStructure_Additional;

import java.util.ArrayList;
import java.util.List;

//import java.util.*;
public class EmployeeInfo {

	/**
	 * Removes from a copy of the input list all duplicate Employees, and then
	 * returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		// implements

		// HashMap<Employee,Employee> res= new HashMap<Employee,Employee> ();
		// note that java 10 has introduced local variable reference, var
		List<Employee> nonDupList = new ArrayList<>();
		for (Employee e : employees) {
			if (!nonDupList.contains(e)) {
				// res.put(e, e);
				nonDupList.add(e);
			}
		}
		return nonDupList;
	}
	
	public static List<Employee> myremoveDuplicates(List<Employee> inlist){
		
		List<Employee> result = new ArrayList<>();
		for(Employee e : inlist) {
			if(!result.contains(e)) {
				result.add(e);
			}
		}
		return result;
	}

	// DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {
		List<Employee> myDupsRemoved = myremoveDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}

}

package Polymorphism_January_2017;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		// implement
		double sum = 0;
		for (Employee emp : emps) {
			for (Account account : emp.getAccounts()) {
				sum += account.getBalance();
			}
		}
		return sum;
	}
}

package Polymorphism_Additional;

import java.util.ArrayList;
import java.util.List;

//You are not allowed to remove the 'final' keyword.
//You are allowed to change Object type in addAccount to another type, as necessary
public final class Bank {

	private List<Account> accountList = new ArrayList<>();

	public void addAccount(Account account) {
		accountList.add(account);
	}

	// IMPLEMENT - polymorphically determine the totals of
	// each account and then return the sum of all these totals
	public double computeBalanceSum() {
		double totalBalance = 0.0;

		for (Account ac : accountList) {

			totalBalance += ac.computeTotal();
		}

		return totalBalance;
	}
}

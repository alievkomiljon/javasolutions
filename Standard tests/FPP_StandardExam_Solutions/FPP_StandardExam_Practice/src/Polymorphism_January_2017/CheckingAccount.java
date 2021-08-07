package Polymorphism_January_2017;

public final class CheckingAccount extends Account {
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	public double getBalance() {
		return balance;
	}
}

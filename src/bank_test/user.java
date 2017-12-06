package bank_test;

public class user {
	private String name;
	private String surname;
	private final BankAccount bankAccount;
	private final double[] transactionList;

	public user(String name, String surname, BankAccount bA, double[] tL) {
		this.name = name;
		this.surname = surname;
		this.bankAccount = bA;
		this.transactionList = tL;
	}

	public String getUserName() {
		return this.name;
	}

	public BankAccount getBankAccount() {
		return this.bankAccount;
	}

	public String getUserSurname() {
		return this.surname;
	}

}

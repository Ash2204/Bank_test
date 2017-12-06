package bank_test;

//import java.util.concurrent.locks.Lock;

//import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private long accountNo;
	private double accountBalance;
	// Lock lock = new ReentrantLock();

	public BankAccount(long accountNo, double accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public long getAccountNo() {
		return this.accountNo;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

	public boolean deposit(double value, user user) {
		// Code to be implemented here.
		// lock.lock();
		user.getBankAccount().accountBalance += value;
		// System.out.println(user.getBankAccount().accountBalance + " => " +
		// value);
		System.out.println();
		System.out.println("Operation for deposit  >> name:" + user.getUserName() + ", surname : " + user.getUserSurname()
						+ ", value => " + value + ", Account Balance = " + user.getBankAccount().accountBalance);
		// lock.unlock();
		return true;

	}

	public boolean withdraw(double value, user user) {

		// lock.lock();
		if (user.getBankAccount().accountBalance < value) {
			System.out.println("Can't withdraw (user:" + user.getUserName() + ",maney:" + String.valueOf(value)
					+ ")! Current account haven't sufficient");
			return false;
		}
		user.getBankAccount().accountBalance -= value;
		System.out.println();
		// System.out.println(user.getBankAccount().accountBalance + " => " +
		// value);
		System.out
				.println("Operation for withdraw >> name:" + user.getUserName() + ", surname : " + user.getUserSurname()
						+ ", value => " + value + ", Account Balance = " + user.getBankAccount().accountBalance);
		// lock.unlock();
		return true;
	}
}

class Transaction implements Runnable {
	private BankAccount sourceAccount, destinationAccount;
	private double amount;

	Transaction(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
		this.amount = amount;
	}

	public void run() {
		// while (!sourceAccount.tryTransfer(destinationAccount, amount))
		// continue;
		System.out.printf("%s completed ", Thread.currentThread().getName());
	}
}

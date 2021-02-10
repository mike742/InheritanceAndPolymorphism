abstract class BankAccount {
	private double _balance;

	public BankAccount(double balance) {
		_balance = balance < 0 ? 0 : balance;
	}

	public double getBalance() {
		return _balance;
	}

	public void deposit(double amount) {
		_balance += amount;
	}

	public double withdraw(double amount) {
		double withdrawSum = 0;
		if (_balance < amount) {
			withdrawSum = _balance;
			_balance = 0;
		} else {
			_balance -= amount;
			withdrawSum = amount;
		}

		return withdrawSum;
	}

	/*
	 * public double withdraw(double amount) {
	 * 
	 * double withdrawSum = 0;
	 * 
	 * if (_balance < amount) { withdrawSum = _balance; _balance = 0; } else {
	 * _balance -= amount; withdrawSum = amount; }
	 * 
	 * return withdrawSum; }
	 */
	public abstract void display();
}

class Savings extends BankAccount {

	private double _intRate;

	public Savings(double balance, double intRate) {
		super(balance);
		_intRate = intRate;
	}

	@Override
	public void display() {
		System.out.println("Savings account balance =  $" + getBalance());
	}

	public void addInterest() {
	}
}

class Checking extends BankAccount {

	public Checking(double balance) {
		super(balance);
	}

	@Override
	public void display() {
		System.out.println("Checking account balance = $" + getBalance());
	}

	public void writeACheck(double amount) {
		super.withdraw(amount + 1);
	}

}

public class BankAccountDriver {

	public static void main(String[] args) {

		BankAccount[] accounts = new BankAccount[100];
		accounts[0] = new Savings(1100, .05);
		accounts[0].deposit(100);

		accounts[0].withdraw(200);

		((Savings) accounts[0]).addInterest();

		accounts[1] = new Checking(-100);

		accounts[1].deposit(50);

		accounts[2] = new Checking(200);

		accounts[2].withdraw(210);

		accounts[2].deposit(100);

		((Checking) accounts[2]).writeACheck(50);

		for (int i = 0; i < accounts.length && accounts[i] != null; i++) {

			accounts[i].display();

		}
	}

}

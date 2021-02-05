
abstract class BankAccount {
	private double _balance;
	
	public BankAccount(double balance) {
		_balance = balance;
	}
	
	
	public void deposit(double amount) {
		
	}
	
	public void withdraw(double amount) {
		
	} 
	
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
		// TODO Auto-generated method stub
		
	}
	
	public void addInterest() {}
}

public class BankAccountDriver {

	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[100];
		accounts[0] = new Savings(1100, .05);
		accounts[0].deposit(100);
		accounts[0].withdraw(200);
		((Savings) accounts[0]).addInterest();
		
	}

}

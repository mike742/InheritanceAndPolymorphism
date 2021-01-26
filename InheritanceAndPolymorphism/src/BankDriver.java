
public class BankDriver {

	public static void main(String[] args) {

		Bank bank = new Bank("CIBC", new Worker("Mark"));
		
		System.out.println( bank.getInfo() );
		
	}

}

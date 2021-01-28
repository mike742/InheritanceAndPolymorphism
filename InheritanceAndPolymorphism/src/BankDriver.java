
public class BankDriver {

	public static void main(String[] args) {

		Bank2 bank = new Bank2("CIBC", new Worker("Mark"));
		bank.getBankName();
		System.out.println( bank.getInfo() );
		
		System.out.println( bank );
	}

}


public class Voucher {
	
	private int _voucherNumber; 
	private String _purchaseDate; 
	private double _amount;
	private String _debitAccount; 
	private String _vendor;
	
	private int _checkNumber; 
	private String _paymentDate;
	
	public Voucher(int voucherNumber, String purchaseDate, double amount,
					String debitAccount, String vendor) {
		
		_voucherNumber = voucherNumber;
		_purchaseDate = purchaseDate;
		_amount = amount;
		_debitAccount = debitAccount;
		_vendor = vendor;

	}
	
	private int getVoucherNumber() {
		return _voucherNumber;
	}
	
	public void issueCheck(int checkNumber, String paymentDate) {
		_checkNumber = checkNumber;
		_paymentDate = paymentDate;
	}
	
	@Override
	public String toString() {
		return "voucher #" + (_voucherNumber) + "\tdate: " + _purchaseDate
				+ "\tamount:" + _amount + "$\n" + "account: " + _debitAccount + "\n"
				+ "check #" + _checkNumber + "\t" + _paymentDate + "\n";
	}
}

import java.util.ArrayList;

public class VoucherManager {
	private static int nextVN = 1001;
	private static int nextChN = 2001;
	
	private ArrayList<Voucher> _vouchers = new ArrayList();
	
	public VoucherManager(int firstVoucherNumber, int firstCheckNumber) {
		nextVN = firstVoucherNumber;
		nextChN = firstCheckNumber;
	}
	
	public void addVoucher(String purchaseDate, double amount,
			String debitAccount, String vendor) {
		
		Voucher newVoucher = new Voucher(nextVN, purchaseDate, amount, debitAccount, vendor);
		_vouchers.add(newVoucher);

		nextVN++;
	}
	
	public void printData() {
		if(_vouchers.size() == 0) {
			System.out.println("No data to print");
		}
		else {
			for(Voucher v : _vouchers) {
				System.out.println(v);
			}
		}
	}
}

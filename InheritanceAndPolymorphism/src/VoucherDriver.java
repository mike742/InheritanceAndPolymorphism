
public class VoucherDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VoucherManager vm1 = new VoucherManager(1001, 2001);
		
		vm1.addVoucher("05/05/2005", 123, "Robertson C.", "Tim Hortons");
		vm1.addVoucher("07/07/2007", 456, "Robertson C.", "Subway");
		
		vm1.printData();
	}

}

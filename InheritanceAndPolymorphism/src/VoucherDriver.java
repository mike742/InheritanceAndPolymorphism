import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class VoucherDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoucherManager vm1 = new VoucherManager(1001, 2001);
		VoucherManager vm2 = new VoucherManager(1, 11);

		vm1.addVoucher("05/05/2005", 123, "Robertson C.", "Tim Hortons");
		vm1.addVoucher("07/07/2007", 456, "Robertson C.", "Subway");

		vm1.issueCheck(1002, "01/01/2021");
		vm1.issueCheck(1005, "02/02/2020");
		vm1.issueCheck(1001, "03/03/2019");

		vm1.printData();
	}

}

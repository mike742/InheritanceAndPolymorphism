
public class SalesPerson extends Person {
	private double _sales = 0.0;
	
	public SalesPerson(String name, double sales) {
		super(name);
		_sales = sales;
		Helper.log();
	}
	
	public double getSales() {
		return _sales;
	}
	
	public void info()  {
		System.out.println(super.getName() + " SalesPerson");
	}
}


public class DealershipDriver {

	public static void main(String[] args) {
		Person manager = new Manager("Mark the Boss");
		
		Person sp1 = new SalesPerson("Bob", 22555.25);
		Person sp2 = new SalesPerson("Mary", 45777.77);
		
		Dealership dsh = new Dealership("OK Used Cars", (Manager)manager);
		
		dsh.addPerson((SalesPerson)sp1);
		dsh.addPerson((SalesPerson)sp2);
		
		dsh.addCar( new Car("Honda Accord") );
		dsh.addCar( new Car("Honda Civic") );
		dsh.addCar( new Car("Ford Focus"));
		
		dsh.printStatus();

	}

}

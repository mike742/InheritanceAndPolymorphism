import java.util.ArrayList;

public class Dealership {
	private String _companyName;
	private Manager _manager;
	private ArrayList<SalesPerson> _people = new ArrayList<SalesPerson>();
	private ArrayList<Car> _cars = new ArrayList<Car>();
	
	public Dealership(String companyName, Manager manager) {
		_companyName = companyName;
		_manager = manager;
	}
	
	public void addPerson(SalesPerson person) {
		_people.add(person);
	}
	
	public void addCar(Car car) {
		_cars.add(car);
	}
	
	public void printStatus() {
		System.out.println("Company: " + _companyName + " manager: " + _manager.getName());
		
		for(SalesPerson sp : _people) {
			System.out.println(sp.getName() + ": " + sp.getSales());
		}
		
		for(Car c : _cars) {
			System.out.println(c.getMake());
		}
	} 
}

import com.address.Address;
import com.person.Person;

public class Employee3 extends Address {
	
	private int _id;
	private Person _person;
	//private Address _address;
	
	public Employee3(int id, String name, String address) {
		super(address);
		_id = id;
		_person = new Person(name);
	}
	
	public void print() { 
		System.out.println(_id + ": " + _person.getName() + " - " + super.getAddress());
	}
}
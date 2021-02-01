import com.address.Address;
import com.person.Person;

public class Employee2 extends Person {
	
	private int _id;
	private Address _address;
	
	public Employee2(int id, String name, String address) {
		super(name);
		_id = id;
		_address = new Address(address);
	}
	
	public void print() { 
		System.out.println(_id + ": " + super.getName() + " - " + _address.getAddress());
	}
}

//import com.address.Address;
//import com.address.Test;
import com.address.*;
import com.person.Person;

public class Employee {
	
	private int _id;
	private Person _person;
	private Address _address;
	
	public Employee(int id, String name, String address) {
		_id = id;
		_person = new Person(name);
		_address = new Address(address);
	}
	
	public void print() {
		System.out.println(_id + ": " + _person.getName() + " - " + _address.getAddress());
	}
}

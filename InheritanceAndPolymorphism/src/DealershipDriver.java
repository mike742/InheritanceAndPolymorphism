
public class DealershipDriver {

	public static void main(String[] args) {
		
		Person p1 = new Developer("Person 1");
		
		Person manager = new Manager("Mark");
		manager.info();
		
		Manager manager2 = new Manager("Lucy");
		manager2.info();
		
		Person sp1 = new SalesPerson("Bob", 22555.25);
		Person sp2 = new SalesPerson("Mary", 45777.77);
		
		Developer d1 = new Developer("John");
		
		Person[] pa = new Person[5];
		
		pa[0] = manager;
		pa[1] = sp1;
		pa[2] = sp2;
		pa[3] = manager2;
		pa[4] = d1;
		
		for(Person p : pa) {
			if(p != null)
				p.info();
		}
		
		Dealership dsh = new Dealership("OK Used Cars", (Manager)manager);
		
		dsh.addPerson((SalesPerson)sp1);
		dsh.addPerson((SalesPerson)sp2);
		
		dsh.addCar( new Car("Honda Accord", Transmission.Automatic) );
		dsh.addCar( new Car("Honda Civic", Transmission.Manual) );
		dsh.addCar( new Car("Ford Focus", Transmission.SemiAutamatic));
		
		dsh.printStatus();

	}

}

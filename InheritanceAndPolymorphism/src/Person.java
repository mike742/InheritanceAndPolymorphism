// Person #1
public abstract class Person {
	private String _name;
	
	public Person(String name) {
		_name = name;
		Helper.log();
	}
	
	public String getName() {
		return _name;
	}
	
	public abstract void info();
}

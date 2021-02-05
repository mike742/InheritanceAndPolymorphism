
public class Manager extends Person {

	public Manager(String name) {
		super(name);
		Helper.log();
	}

	public void info() {
		System.out.println(super.getName() + " manager");
	}

	public void onlyManagerMethod() {
		System.out.println("only Manager method for " + getName());
	}
}

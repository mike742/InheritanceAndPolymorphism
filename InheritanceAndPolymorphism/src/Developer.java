
public class Developer extends Person {

	public Developer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		System.out.println(super.getName() + " Developer");
	}

}

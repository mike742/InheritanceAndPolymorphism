

public class Car {
	private String _make;
	private Transmission _transmission;
	
	public Car(String make, Transmission transmission) {
		_make = make;
		_transmission = transmission;
	}
	
	public String getMake() {
		return _make;
	}
}

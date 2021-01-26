
public class Worker {
	
	private String _name;
	
	public Worker(String name) {
		Helper.log();
		_name = name;
	}
	
	public String getWorkerName() {
		Helper.log();
		return _name;
	}
}


public class Bank {
	private String _name;
	
	// this."has-a"
	private Worker _worker; 
	
	public Bank(String name, Worker worker) {
		Helper.log();
		_name = name;
		_worker = worker;
	}
	
	public String getBankName() {
		Helper.log();
		return _name;
	}
	
	public String getInfo() {
		Helper.log();
		return _worker.getWorkerName() + " works in " + _name;
	}
}

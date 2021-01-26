
public class Bank2{
	private String _name;
	
	// this."has-a"
	private Worker _worker; 
	
	public Bank2(String name, Worker worker) {
		_name = name;
		_worker = worker;
	}
	
	public String getBankName() {
		Helper.log();
		return _name;
	}
	
	public String getInfo() {
		Helper.log();
		// System.out.println("Bank -> getInfo()");
		return _worker.getWorkerName() + " works in " + _name;
	}
}

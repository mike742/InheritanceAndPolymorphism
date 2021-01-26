import java.util.ArrayList;

public class ArrayListDriver {

	public static void main(String[] args) {
		
		ArrayList<String> listOfBanks = new ArrayList<String>();
		
		System.out.println("size = " + listOfBanks.size());
		
		listOfBanks.add("CIBC");
		listOfBanks.add("RBC");
		listOfBanks.add("BMO Bank of Montreal");
		
		listOfBanks.add(0, "The Big Bank");
		listOfBanks.add("RBC");
		
		System.out.println(listOfBanks + " size = " + listOfBanks.size());
		
		System.out.println(listOfBanks.contains("RBC"));
		System.out.println(listOfBanks.indexOf("RBC"));
		System.out.println(listOfBanks.lastIndexOf("RBC"));
		
		listOfBanks.set(listOfBanks.indexOf("RBC"), "Mark's Bank");
		System.out.println(listOfBanks.get(0));
		listOfBanks.remove(4);
		System.out.println(listOfBanks + " size = " + listOfBanks.size());
		
		listOfBanks.clear();
		System.out.println(listOfBanks + " size = " + listOfBanks.size());
	}

}

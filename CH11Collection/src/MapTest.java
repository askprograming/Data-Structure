import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		//create a map
		
		Map <String, Double> salaryMap = new HashMap<String, Double>();
		
		//add key value pairs to it
		
		salaryMap.put("Stuart Reges", 100000.00);
		salaryMap.put("Marty Stepp", 900000.00);
		salaryMap.put("Mickey Mouse", 840000.00);

		System.out.println(salaryMap);
		
		//look a value 
		double mickeySalary = salaryMap.get("Mickey Mouse");
		System.out.printf("Mickey's salary is $%.2f\n",mickeySalary);
		
		
		//creat SSN and name map
		
		Map<Integer, String> ssnMap = new TreeMap<Integer, String>();
		
		ssnMap.put(1111111, "Stuart reges");
		ssnMap.put(2222222, "Marty Stepp");
		ssnMap.put(3333333, "Mickey Mouse");
		
		//loop over and print ever person's ssn
		Set <Integer> ssnSet = ssnMap.keySet();
		for(int ssn : ssnSet) {
			System.out.println("SSN: " + ssn);
		}
		
		//loop over each person 
		
		Collection<String> names = ssnMap.values();
		for(String name : names){
			System.out.println("Name: " + name);
		}
		
		//print both SSn(key) and the name (value)
		for(int ssn : ssnMap.keySet()) {//we got the keys
			//pass the key to get method which will return the corresponding value
			String name = ssnMap.get(ssn);
			System.out.println(ssn + " " + name);
		}
	}

}

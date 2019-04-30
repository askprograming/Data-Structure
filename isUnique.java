import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class isUnique {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "cat");
		map.put("two", "dog");
		//map.put("three", "cat");
		
		System.out.println(isUnique(map));
	}

	public static boolean isUnique(Map<String, String>map) {
		//create a set to hold the values(they will all be unique)
		Set<String> values = new HashSet();
		//iterate over the values in the map
		for(String value: map.values()) {
			//check if the set has the we are currently examining
			if(values.contains(value)) {
				return false;//the value is already there
			}else
			{
				//add the value for the map to the set
				values.add(value);
			}
		}
		//no repeating values were found in the set
		return true;
	}
}

/*

public static boolean isUnique(Map<String, String>map) {
 Set<String> set = new HashSet<String>(map.values())
if(map.value().size()!=set.size()){
return false;
}
return true;

*/
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorlooping {

	public static void main(String[] args) throws FileNotFoundException{
		Set<String> stooges = new HashSet<String>();
		
		stooges.add("Moe");
		stooges.add("Moe");
		stooges.add("Moe");
		stooges.add("Moe");
		stooges.add("Moe");
		
		Iterator<String> itr = stooges.iterator();
		while (itr.hasNext());
		String name=itr.next();
		name = name.toLowerCase();
		System.out.println("Iterating ower a set..." + name);
		

	}

}

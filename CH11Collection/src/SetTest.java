import java.util.Set;
import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> stoogs = new HashSet<String>();
		
		stoogs.add("Layyy");
		stoogs.add("Curly");
		stoogs.add("Moe");//duplicate
		stoogs.add("Shemp");
		stoogs.add("Moe");//duplicate
		
		System.out.print(stoogs.toString());
		

	}

}

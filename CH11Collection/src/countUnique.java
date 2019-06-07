import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class countUnique {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(countUnique(list));

	}

	private static int countUnique(List<Integer> list) {
		Set<Integer> numbers = new TreeSet<Integer>(list);
		return numbers.size();
	}

}

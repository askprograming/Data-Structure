
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise_alternate {

	 
	public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    Iterator<Integer> i1 = list1.iterator();
	    Iterator<Integer> i2 = list2.iterator();
	    
	    while (i1.hasNext() || i2.hasNext()) {
	        if (i1.hasNext()) {
	            result.add(i1.next());
	        }
	        if (i2.hasNext()) {
	            result.add(i2.next());
	        }
	    }
	    return result;
	}
}
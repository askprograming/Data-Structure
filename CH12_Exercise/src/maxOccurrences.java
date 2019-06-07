import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;

public class maxOccurrences {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(4);
		System.out.print(maxOccurrences(list));
	}


public static String maxOccurrences(LinkedList<Integer> list) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int count = 0;

    for(int n : list) {
        if(map.containsKey(n)) {
            map.put(n, map.get(n) + 1);
        } else {
            map.put(n, 1);
        }

        if(map.get(n) > count)
            count = map.get(n);
        	
    }

    return ("The most occurrence happens " + count + " times");
    
}












}

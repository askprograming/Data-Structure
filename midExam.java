//Question 1 
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


//Question 2

//[2,6,1,8] the out put is => 1, 2, 6, 8  

//[30, 20, 10, 60, 50, 40] the out put is =>  10, 30, 40, 20 60, 50

//[-4, 16, 9, 1, 64, 25, 36, 4, 49] => -4, 1, 25, 4, 16, 9, 64, 36, 49  the out put is 

//Question 3

//The out put for 	mystery3(6)  => 6

//					mystery3(17) => 8 

													/* Groups Names	CAMILA CHRISTENSEN
													 * 		ANDY FESSEL
													 * 		ASGEDOM HAILEMARIAM
													*/		

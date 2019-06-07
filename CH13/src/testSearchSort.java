import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testSearchSort {

	public static void main(String[] args) {
		//test list
		
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("b");
		list.add("h");
		list.add("d");
		list.add("f");
		list.add("e");
		list.add("a");
		
		//sequential search for a letter using indexOf
		int index = list.indexOf("h");
		if(index >= 0) {
			System.out.println("h is a word with index " + index);
		}else {
			System.out.println("h is not found. ");
		}
		//binery search for an array
		int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
		int index1 = Arrays.binarySearch(numbers, 42);
		System.out.println("29 was found at index " + index1);
		
		//collections binary search
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		int index2 = Collections.binarySearch(intList, 5);
		System.out.println("5 was found at index"+ index2);
		
		
		//Arrays sort
		String [] Strings = {"C","b","g","h","d","f","e","a"};
		Arrays.sort(Strings);
		System.out.println(Arrays.toString(Strings));
		
		//collections sort
		Collections.sort(list);
		System.out.println(list);
	}

}

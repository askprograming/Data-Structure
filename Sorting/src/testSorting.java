import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testSorting {

	public static void main(String[] args) {
		String[] words = {"foo", "bar","baz","ball"};
		Arrays.sort(words);
		
		System.out.println(Arrays.toString(words));
		
		ArrayList<String> words2 = new ArrayList<String>();
		for (String word : words) {
			words2.add(word);
		}
		Collections.sort(words2);
		System.out.println(words2);
		

	}

}

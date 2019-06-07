import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//use maps to implement a word count to see which words occur most frequently in the text
public class WordCount {

	public static final int OCCURRENCES = 2000;
	
	public static void main(String[] args) throws  FileNotFoundException {
		
		System.out.println("Display the most words wich occur most frequently in Moby Dick");
		System.out.println(" ");
		
		//read the book into a map
		Scanner in = new Scanner (new File("mobydick.txt"));
		Map<String, Integer> wordCountMap = getCountMap(in);//getCountMap(in) to read from the file
		
		for (String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);//read the final count
			if(count > OCCURRENCES) {
				System.out.println(word + " occurs" + count +" times.");
			}
		}
	}

	private static Map<String, Integer> getCountMap(Scanner in) {
		Map <String , Integer> wordCountMap = new TreeMap<String, Integer>();
		
		
		
		while (in.hasNext()) { //iterate over the entire book
			String word = in.next().toLowerCase();
		if(!wordCountMap.containsKey(word)) {//never seen it before
			//add it to map
			wordCountMap.put(word,  1);
		}else {//we have seen the word before
			int count = wordCountMap.get(word);//get the value based on the key
			wordCountMap.put(word, count + 1);
		}
		
		}
		return wordCountMap;
	}
}

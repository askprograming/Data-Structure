
//ArrayList examples
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class stopWords {

	public static void main(String[] args) throws FileNotFoundException {

		// build the list of stop words
		ArrayList<String> stopWords = new ArrayList<String>();
		stopWords.add("a");
		stopWords.add("be");
		stopWords.add("by");
		stopWords.add("how");
		stopWords.add("is");
		stopWords.add("it");
		stopWords.add("or");
		stopWords.add("that");
		stopWords.add("the");
		stopWords.add("this");
		stopWords.add("to");
		stopWords.add("why");

		// process the file printing all but the stop words

		Scanner input = new Scanner(new File("words.txt"));

		while (input.hasNext()) {
			String next = input.next();
			if (!stopWords.contains(next.toLowerCase())) {// chake by excluding the !
				System.out.println(next + " ");
			}

		}

	}

}

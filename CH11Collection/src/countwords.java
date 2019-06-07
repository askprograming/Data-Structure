import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class countwords {

	public static void main(String[] args) throws FileNotFoundException {
		
		//create a new instant of a set containing string
		Set<String> words = new HashSet<String>();
		//read a file
		Scanner in = new Scanner(new File("mobydick.txt"));
		//while there more words
		while(in.hasNext()) {
			//read a word from the file and store it in a string 
			String word = in.next();
			//convert all the word to lower case
			word = word.toLowerCase();
			//add the word from the file to the set we created 
			//set will only retain unique words
			words.add(word);
		}
		
		System.out.println("Number of unique words: " + words.size());

	}

}

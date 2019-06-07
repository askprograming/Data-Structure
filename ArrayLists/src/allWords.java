import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class allWords {

	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> allWords = new ArrayList<String>();
		 input = new Scanner (new File("Words.text"));
		 while(input.hasNext()){
			 String word = input.next();
		 allWords.add(word);

	}
	System.out.println(allWords);
}
}
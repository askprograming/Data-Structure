import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionSuffle {
	public static void main(String[] args) {
		//collections.shuffle
		String[] ranks = {"2","3","4","5","6","7","8","9","10", "Jack","Queen","King","Ace"};
		String[] suits = {"Clubs", "Dianonds","Hearts", "Spades"};
		
		List<String> deck = new ArrayList<String>();
		
		for(String rank: ranks) {
			for (String suit : suits) {
				deck.add(rank + " of " + suit);
			}
		}
		Collections.shuffle(deck);
		System.out.println("Top Card = " + deck.get(0));
	}
}
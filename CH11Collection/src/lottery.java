import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class lottery {
	
	public static final int NUMBERS = 6;
	public static final int MAX_NUMBER = 40;
	
	public static void main (String[] asgs) {
		
		//get winning number and ticker numbers
		
		Set<Integer>winningNumbers = creatWinningNumber();
		Set<Integer>ticket = getTicket();
		System.out.println();
		
		//keep inly winning numbers
		Set<Integer> intersection = new TreeSet<Integer>(ticket);
		intersection.retainAll(winningNumbers);
		
		//print results
		System.out.println("Your ticker numbers: " + ticket);
		System.out.println("Winning numbers :" + winningNumbers);
		System.out.println("You had " + intersection.size() + "numbers. ");
		System.out.println("The matched numbers are: "+ intersection);
		
		//calculate price
		double prize = 0.0;
		if(intersection.size() > 0) {
		prize = 100 * Math.pow(2, intersection.size());
		}//else size is 0, so no prize
		System.out.println("Your prize is $ " + prize);
	}
	
	public static Set<Integer> creatWinningNumber(){
		Set<Integer> winningNumbers = new TreeSet<Integer>();
		Random r = new Random();
		
		while(winningNumbers.size()<NUMBERS) {
			int number = r.nextInt(MAX_NUMBER) + 1;
			winningNumbers.add(number);
		}
		
		return winningNumbers;
	}
	
	private static Set<Integer>getTicket(){
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner (System.in);
		System.out.println("Type your " + NUMBERS + " unique lotto numbers");
		while(ticket.size()< NUMBERS) {
			int number =console.nextInt();
			ticket.add(number);
		}
		return ticket;
	}
	
	
}

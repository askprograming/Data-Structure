import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class primeumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//gretting
		System.out.println("This program will tell you all prime number up toa max number");
		
		//get the max number
		Scanner console = new Scanner(System.in);
		System.out.print("Max number? ");
		int max = console.nextInt();
		
		LinkedList<Integer> primes = sieve(max);
		System.out.print(primes);
	}
		//returns a list of primes up to a max numner
		
		public static LinkedList<Integer>sieve(int max){
		LinkedList<Integer> primes = new LinkedList<Integer>();
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(int i = 2; i <= max; i++) {
			numbers.add(i);
		}
		
		while(!numbers.isEmpty()) {
			//remove prime numbers from the front
			int front = numbers.remove(0);
			primes.add(front);
			
			//remove all multiples of this prime number
			Iterator<Integer> itr = numbers.iterator();
			while(itr.hasNext()) {
				int current = itr.next();
				if(current % front == 0) {//front is not prime
					itr.remove();
				}
			}
		}
			return primes;
		}
	
	}



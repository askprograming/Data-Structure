
public class bin_to_decRecursion {

	public static void main(String[] args) {
		printBinary(42);

	}
	
	public static void printBinary(int n) {
		//base case
		if(n < 2) {
			System.out.print(n);
		}else {
			//recurcive case. break the number part
			printBinary(n / 2);
			printBinary(n % 2);
			
		}
	}

}

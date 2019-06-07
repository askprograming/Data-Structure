
public class starRecursion {

	public static void main(String[] args) {
	
		printStar(5);
		System.out.println();
		System.out.println(pow(2,4));
	}
	

	//recursive fact
	public static void printStar (int n) {
		if(n == 0) {
			System.out.println("*");
		}else {
			//method rescursively calls itself
			System.out.print("*");
			
			printStar(n-1);
		}
	}


public static int pow(int base, int exponent) {
	//base case
	if(exponent == 0) {
		return 1;//any number to 0 is 1
	}else {
		//recursive case : x ^ y = x * x(y-1)
		
		return base*pow(base , exponent - 1);
	}
}
}

public class TestRecursion {

	public static void main(String[] args) {
	/*
		//fact with a loop
		//int i;
		int fact = 1;
		int number =6;
		for(int i=1; i<=number; i++) {
			fact = fact * i;
		}
		
		System.out.println("Fact with a loop:" + fact);
	*/
		System.out.println("Fact with recursion: " + fact(6));

	}

	//recursive facr
	public static int fact (int n) {
		if(n == 1) {
			return 1;
		}else {
			//method rescursively calls itself
			return (n*fact (n - 1));
		}
	}
}

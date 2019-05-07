
public class nInteger {
	
	public static void main(String[] args) {
		writeNums(-1);
	}
	
	public static void writeNums(int n) {
		if(n<1) {
			throw new IllegalArgumentException();
		}else if(n == 1) {
			System.out.print(1);
		}else {
			writeNums(n-1);
			System.out.print(", " + n);
		}
	}
}
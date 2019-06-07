
public class swaping {

	public static void main(String[] args) {
		int a =7;
		int b =35;
		int[] res = swap (a,b);
		System.out.print("a "+  res[0] +  "    b " + res[1]);

	}
	
	public static int[] swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		int[] res = new int[2];
		res[0] = a;
		res[1] = b;
		return res;
	}
	

}

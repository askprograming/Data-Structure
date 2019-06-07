import java.util.ArrayList;

public class arraylistloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(13);
		list.add(47);
		list.add(78);
		list.add(25);
		
		int sum = 0;
		
		for(int n: list) {
			System.out.println("n is: " + n);
			System.out.println("sum is: " + sum);
			sum =+ n;
		}
		System.out.println(list);
		System.out.println("sum: "+ sum);

	}

}

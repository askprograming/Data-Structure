import java.util.LinkedList;
import java.util.Queue;

public class queneStack {

	//LIFO
	public static void main(String[] args) {
		String[] data = {"to", "be", "not", "to", "be"};
		
		Queue<String> q = new LinkedList<String>();
		
		for(String str : data) {
			q.add(str);
		}
		System.out.println("queue" + q);
		
		System.out.println("size" + q.size());
		System.out.println("peek" + q.peek());
		
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
		
		System.out.println();
		
		System.out.print("queen " + q);

	}

}

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		
		String[] data = {"to", "be", "or", "not", "to","be"};
		
		Stack<String> s = new Stack <String>();
		
		for(String str : data) {
			s.push(str);
			
		}
		System.out.println("stack= " + s);
		System.out.println("size =" + s.size());
		System.out.println("peek =" + s.peek());
		
		s.push("ITC");
		s.push("255");
		
		System.out.println(s.firstElement());
		
		
		
		while(!s.isEmpty()) {
			System.out.print(s.pop() +" ");
		}
		System.out.println();
	}

}

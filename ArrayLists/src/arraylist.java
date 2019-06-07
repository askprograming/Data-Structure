import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("seal");
		words.add("cat");
		
		System.out.println("Words: " + words);
		
		for(int i = 0; i< words.size(); i+=2) {
			words.add(i,"~");
			
//		for(int i=0; i<words.size(); i++) {
//			words.remove(i);
			
//		}
		}
		
		System.out.println(words);

	}

}

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> names = new ArrayList<String>();//syntax for array list operations
		 names.add("Marty Stepp");
		 names.add("Stuaer Reges");
		 names.add("Alan Turing");
		 names.add(2, "Ada Lovelace");
		 names.remove(0);
		 System.out.println(names.toString());
		// System.out.println(names);//
	}

}

import java.util.ArrayList;

public class asgedom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ian");
		names.add("Sebby");
		names.add("Skye");
		names.add("Claire");
		names.add("Tom");
		names.add("Lucas");
		names.add("Nate");
		names.add("Mia");
		
		System.out.print(removeEvenLength(names));
	}
	
	public static ArrayList<String> removeEvenLength(ArrayList<String> list){
		for(int i = list.size()-1; i >= 0; i--) {
			if(list.get(i).length() % 2 == 0) {
				list.remove(i);
			}
		}
		return list;
		
	}

}
import java.util.ArrayList;

public class RemoveAllEvenLength{
	
	
	public static ArrayList<String> removeEvenLength(ArrayList<String> list){
		for(int i = list.size()-1; i >= 0; i--) {
			if(list.get(i).length() % 2 == 0) {
				list.remove(i);
			}
		}
		return list;
	}
	
	
public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("This");
		names.add("is");
		names.add("test");
		names.add("for");
		names.add("remove");
		names.add("Array");
		names.add("List");
		System.out.print(removeEvenLength(names));
	}
}
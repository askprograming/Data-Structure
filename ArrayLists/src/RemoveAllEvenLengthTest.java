import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RemoveAllEvenLengthTest {

	@Test
	public void test() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("odd");
		
		removeEvenLength(list);
		
		//asser(3, list.size())
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

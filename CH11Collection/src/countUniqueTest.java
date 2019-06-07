import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class countUniqueTest {

	@Test 
		public void testCountUnique() {
			List<Integer> list = new LinkedList<Integer>();
			
			Set<Integer> numbers = new TreeSet<Integer>(list);
			
			assertEquals(0, numbers.size());
		
	}

}

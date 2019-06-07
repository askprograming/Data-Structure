
//simple version of ArrayList of ints
public class SimpleArrayIntList {

		
		//fields or instance vars
		private int[] elementData;
		private int size;
		
		//constructor
		public SimpleArrayIntList() {
			elementData = new int[100];
			size = 0;
		}
		
		public void add(int value) {
			elementData[size] = value;
			size++;

		}
		public String toString() {
			// fence post
						String result = "[" + elementData[0];
						for (int i = 1; i < size; i++) {
							result += ", " + elementData[i];
						}

						result += "]";
						return result;

		}
	

}

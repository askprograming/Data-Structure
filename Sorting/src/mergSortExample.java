import java.util.Random;

public class mergSortExample {

	public static void main(String[] args) {
		
		String[] words = {"cat", "dog", "seal","snake"};
		System.out.println(words);
		mergeSort(words);
		
		int n = 10000;
		String[] list1 = new String[n];
		Random r = new Random();
		for (int i=0; i < n; i++) {
			String text = "some text with #" + r.nextInt(2 * n);
			list1[i] = text;
		}
		
		//test merge sort time
		long start = System.currentTimeMillis();
		
		mergeSort(list1);
		double elapsed2 = (System.currentTimeMillis()- start) /1000.0;
		System.out.println("merge sort "+ elapsed2 + "seconds");
	}
	
	//merge sort
	//post: list in a sort non decreasing order
	public static void mergeSort(String[] array) {
		if(array.length > 1) {
			//split the array into two smaller arrays
			int size1 = array.length/2;
			int size2 = array.length - size1;
			
			String[] half1 = new String[size1];
			String[] half2 = new String[size2];
			
			for (int i=0; i< size1; i++) {
				half1[i] = array[i];
				}
			for (int i = 0; i< size2; i++) {
				half2[i] = array[i];
			}
			
			mergeSort(half1);
			mergeSort(half2);
			
			//merge the sorted hafe into a sorted whole attay
			merge(array, half1, half2);
		}
	}

	private static void merge(String[] result, String[] list1, String[] list2) {
		
		int i1 = 0;
		int i2 = 0;
		
		for(int i = 0; 9< result.length; i++) {
			if (i2 >= list2.length || 
					(i1 < list1.length && list1[i1].compareTo(list2[i2]) <= 0)){
				result[i] = list1[i1];
				i1++;
				
			}else {
				result[i] = list2[i2];
				i2++;
			}
			
		}
	}

}

import java.util.Arrays;

public class selectionSortExr {

	public static void main(String[] args) {
		//array should be sorted
		int[] numbers = {1, 3, -2, 50, 32};
		System.out.println(Arrays.toString(numbers));
				
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	//to selects the largest element of an array and moves to the end of the array
	
	public static void selectionSort(int[] list) {
		//scan the element
		for(int i = list.length - 1; i > 0 ; i--) {
			
			//starting point is i and find the maximum number
			int largest = i; 
			//j will be the next one and j is assigned to largest if the value of j is bigger than larger
			for(int j = 0; j < i; j++) { 
				if(list[j] > list[largest]) { 
					largest = j;
				}
			}
			
			//swap the i with largest
			swap(list, i, largest); 
			
		}
		
	}
	
	
	//swap i with largest
	public static void swap(int[] list, int i, int largest) {
		int temp = list[i];
		list[i] = list[largest];
		list[largest] = temp;
		
		
	}

}
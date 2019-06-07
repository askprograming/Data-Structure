
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class selectionSortExample {

	public static void main(String[] args) {
		int[]numbers = {2,5,-2,4,42,3};
		
		int n = 1000000;
		int[]numbers1 = createRandomIntArray(n);
		
		long start = System.currentTimeMillis();
		
		selectionSort(numbers1);
		double elapsed = (System.currentTimeMillis() - start)/1000.0;
		
		System.out.println("selection sort " + elapsed + " seconds");
		//System.out.println(Arrays.toString(numbers));
		

	}
	private static int[] createRandomIntArray(int size) {
		int[] numbers1 = new int [size];
		Random rand = new Random();
		
		int min = rand.nextInt(size);
		int max = rand.nextInt(size - min) + min; 
		for(int i = 0; i< size; i++) {
			numbers1[i] = rand.nextInt(max - min + 1) + min;
			
			//numbers1[i] = rand.nextInt(size * 2);
		}
		return numbers1;
	}
	//selection sort
	//place the element of the array into a sorted order
	// post: array is sorted in nondecreasing
	
	public static void selectionSort(int[] a) {
		for(int i = 0; i < a.length -1; i++) {
			//find the smallest element
			int smallest = i;
			for(int j = i + 1; j< a.length; j++) {
				if(a[j] < a[smallest]) {
					smallest = j;
				}
			}
			
			swap(a, i, smallest);//swap the smallest to the front
		}
	}
//swap a[i] with a[j]
	private static void swap(int[] a, int i, int j) {
		if(i !=j) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
}

import java.util.Arrays;

public class bubbleSortExam {

	public static void main(String[] args) {
		
		//test
		int a[] = {42,-3,2,5,7,1,99};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void bubbleSort(int a[]) {
		for (int i = 0; i< a.length -1; i++) {
			for(int j=0; j< a.length - i -1; j++) {
				if(a[j] > a[j+1]) {
					//swap a[j+1] and a[J}
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}

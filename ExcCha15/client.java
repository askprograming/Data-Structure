public class client {

	public static void main(String[] args) {
		// construct and print list
        int[] data = {5, 19, 0, 2, 4, 0, 13, 85, -8, 0, 23};
        arrayIntList list = new arrayIntList();
        for (int n : data) {
            list.add(n);
        }
        System.out.println("list before = " + list);
	}}
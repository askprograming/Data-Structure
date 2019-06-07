
public class listClient1 {

	public static void main(String[] args) {
		linkedIntList list = new linkedIntList();
		list.add(18);
		list.add(27);
		list.add(42);
		list.add(3);
		list.add(-1);
		
		
		
		
		System.out.println(list);
		System.out.println("Size" + list.size());
		System.out.println("Get" + list.get(2));
		list.add(5,77);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		System.out.println("Size" + list.size());
		System.out.println("Get" + list.get(2));
	}

}

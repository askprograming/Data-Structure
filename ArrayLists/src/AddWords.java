import java.util.ArrayList;

public class AddWords {

	  public static void main(String[] args) { 
	    ArrayList<String> cars = new ArrayList<String>();//syntax for array list operations
	    System.out.println("list = " + cars);
	    cars.add("Volvo");
	    System.out.println("list = " + cars);
	    cars.add("BMW");
	    System.out.println("list = " + cars);
	    cars.add("Ford");
	    System.out.println("list = " + cars);
	    cars.add("Honda");
	    System.out.println("list = " + cars);
	    cars.add(2,"Mazda");
	    cars.remove(1);
	   // cars.replaceAll("BMW", "aa");
	    System.out.println(cars);
	  } 
	}
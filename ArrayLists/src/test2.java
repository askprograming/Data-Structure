import java.io.FileNotFoundException;
import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(3.2);
		grades.add(2.7);
		
		double myGrade = grades.get(0);
		System.out.println(myGrade);

	}

}

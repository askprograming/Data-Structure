import java.util.Scanner;

public class prefixevaluater {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("This program evaluates prifix expressions");
		System.out.println("For operattors +, _, *, ? and %");
		
		System.out.print("Expression?");
		System.out.println("Value = " + evaluate(console));
		
	}
	
	//pre condition:input contains valid prefix expression
	//post condition: expression is consumed and the result returned
	public static double evaluate (Scanner input) {
		//base case
		if(input.hasNextDouble()) {
			return input.nextDouble();
		}else {
			String operator = input.next();
			double operand1 = evaluate(input);
			double operand2 = evaluate(input);
			return evaluate(operator, operand1, operand2);
			
		}
	}

	private static double evaluate(String operator, double operand1, double operand2) {
		if(operator.equals("+")){
			return operand1 + operand2;
		} else if (operator.equals("-")){
			return operand1 - operand2;
		} else if (operator.equals("*")){
			return operand1 * operand2;
		} else if (operator.equals("/")){
			return operand1 / operand2;
		} else if (operator.equals("%")){
			return operand1 % operand2;
		} else {
			throw new RuntimeException("illegal operation" + operator);
		}
	}

}

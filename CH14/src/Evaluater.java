import java.util.Scanner;
import java.util.Stack;

public class Evaluater {

	public static void main(String[] args) {
		System.out.println("This program evaluates a fully paraenthesized expression");
		System.out.println("with the +, _ , *, and / opreations");
		System.out.println("operators +, -, *, +, and ^");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		System.out.print("Expression(return ti quite)?");
		String line = console.nextLine().trim();
		
		while(line.length() > 0) {
			evaluate(line);
			System.out.print("Expression(return to quite)?");
			line = console.nextLine().trim();
		}
	}

		//pre: the expression is fully parenthesizes
		//post: print the value of the expression ot an error message if the expression is illega
	private static void evaluate(String line) {
		StringSplitter data = new StringSplitter(line);
		Stack<String> symbols = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		
		boolean error = false;
		while(!error && data.hasNext()) {
			String next = data.next();
			if(next.equals(")")) {
				if(symbols.size() < 2 || symbols.peek().equals("(")) {
					error = true;
				}
				else {
				String operator = symbols.pop();
				
				if(!symbols.peek().equals("(")) {
					error = true;
				}else {
				symbols.pop();//remove the (
				double oper2 = values.pop();
				double oper1 = values.pop();
				double value = evaluate(operator, oper1, oper2);
				values.push(value);
					}
				}
				
			}else if("(+-*/".indexOf(next)!= -1) {
				symbols.push(next);
			}else {//it should be a numbers
				values.push(Double.parseDouble(next));
			}
		}
		if(error || values.size() !=1 || !symbols.isEmpty()) {
			System.out.print("Illegal expression");
		}else {
			System.out.println(values.pop());
		}
	}
	public static double evaluate(String operator, double operand1,
            double operand2) {
if (operator.equals("+")) {
return operand1 + operand2;
} else if (operator.equals("-")) {
return operand1 - operand2;
} else if (operator.equals("*")) {
return operand1 * operand2;
} else if (operator.equals("/")) {
return operand1 / operand2;
} else if (operator.equals("^")) {
return Math.pow(operand1, operand2);
} else {
throw new RuntimeException("illegal operator " + operator);
}
}
}

import java.util.Scanner;

public class calc {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First number:");
		double x = input.nextInt();
		System.out.println("Second number:");
		double y = input.nextInt();

		double Add = x + y;
		double Subtract = x - y;
		double Divide = x / y;
		double Multiply = x * y;

		System.out.println(x + " added to " + y + " equals \t\t" + Add);
		System.out.println(x + " minus " + y + " equals \t\t" + Subtract);
		System.out.println(x + " divided by " + y + " equals \t\t" + Divide);
		System.out.println(x + " multiplied by " + y + " equals \t\t" + Multiply);


	}


}

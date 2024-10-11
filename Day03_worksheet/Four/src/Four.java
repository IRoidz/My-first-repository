import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter arithmetic operation: ");
        String expression = scan.nextLine().replace(" ", "");

        if (expression.contains("+")) {
            String[] addition = expression.split("\\+");
            double result = Double.parseDouble(addition[0]) + Double.parseDouble(addition[1]);
            System.out.println("The result is: " + result);

        } else if (expression.contains("-")) {
            String[] subtraction = expression.split("-");
            double result = Double.parseDouble(subtraction[0]) - Double.parseDouble(subtraction[1]);
            System.out.println("The result is: " + result);

        } else if (expression.contains("*")) {
            String[] multiplication = expression.split("\\*");
            double result = Double.parseDouble(multiplication[0]) * Double.parseDouble(multiplication[1]);
            System.out.println("The result is: " + result);

        } else if (expression.contains("/")) {
            String[] division = expression.split("/");
            double result = Double.parseDouble(division[0]) / Double.parseDouble(division[1]);
            System.out.println("The result is: " + result);

        } else {
            System.out.println("Invalid expression");
        }
    }
}
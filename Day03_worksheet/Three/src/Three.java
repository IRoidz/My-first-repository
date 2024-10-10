import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = scan.nextDouble();
        System.out.print("Enter second number: ");
        double secondNum = scan.nextDouble();
        System.out.println("Enter number that corresponds with your choice.");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operand = scan.nextInt();

        switch (operand) {
            case 1:
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case 2:
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case 3:
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;
            case 4:
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
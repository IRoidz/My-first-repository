import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total cost of purchase: ");
        double totalCost = scan.nextDouble();
        System.out.print("Enter amount of money used to buy: ");
        double money = scan.nextDouble();

        double change = money - totalCost;
    }
}
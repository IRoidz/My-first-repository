import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter short string: ");
        String sString = scan.nextLine();
        System.out.print("Enter longer text: ");
        String text = scan.nextLine();
        int counter = 0;

        if (sString.length() == 0) {
            System.out.println("The string is empty");
            return;
        }

        for (int i = 0; i <= text.length() - sString.length(); i++) {
            boolean found = false;
            if (text.charAt(i) == sString.charAt(0)) {
                for (int j = 0; j < sString.length(); j++) {
                    if (text.charAt(i + j) != sString.charAt(j)) {
                        found = false;
                        break;
                    }
                    found = true;
                }
            }
            if (found) {
                counter++;
            }
        }
        System.out.println("Number of occurences: " + counter);
    }
}
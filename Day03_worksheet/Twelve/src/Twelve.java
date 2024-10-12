import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        String prevLetters = "";

        while (true) {
            int counter = 0;
            System.out.print("Which letter would you like to count now? ");
            String letter = scan.nextLine();

            if(prevLetters.contains(letter)) {
                System.out.println("Repeated character, Exiting the program...");
                break;
            }

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == letter.charAt(0)) {
                    counter++;
                }
            }
            prevLetters += letter;
            System.out.println("There are " + counter + " in your text.");
        }
        System.out.println("Thank you for your cooperation. Good bye!");
    }
}
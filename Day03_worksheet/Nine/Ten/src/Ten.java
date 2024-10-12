import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        System.out.print("Enter letter you would like to keep count of: ");
        char letter = scan.next().charAt(0);
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
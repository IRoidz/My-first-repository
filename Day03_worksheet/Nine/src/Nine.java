import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                System.out.println();
            } else {
                System.out.print(text.charAt(i));
            }
        }
    }
}
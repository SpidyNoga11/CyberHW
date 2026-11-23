import java.util.Scanner;

public class Horse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to Stop? ");
        String userInput = scanner.nextLine();

        boolean alwaysTen = false;

        while (!userInput.equalsIgnoreCase("yes")) {
            System.out.print("Enter number 1: ");
            int x = scanner.nextInt();

            System.out.print("Enter number 2: ");
            int y = scanner.nextInt();
            scanner.nextLine(); // ניקוי תו ירידת השורה אחרי nextInt

            int c = x + y;
            if (c >= 10) {
                alwaysTen = true;
            }

            if (alwaysTen) {
                c = 10;
            }

            System.out.println(c);

            System.out.print("Would you like to Stop? ");
            userInput = scanner.nextLine();
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        char ch;

        System.out.println("Hey, this is the simple program for the calculator");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");

        System.out.println("Enter your choice: ");
        ch = scanner.next().charAt(0);

        switch (ch) {
            case '1':
                System.out.println("Enter the two numbers");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x + y);
                break;
            case '2':
                System.out.println("Enter the two numbers");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x - y);
                break;
            case '3':
                System.out.println("Enter the two numbers");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x * y);
                break;
            case '4':
                System.out.println("Enter the two numbers");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x / y);
                break;
            default:
                System.out.println("Wrong choice");
        }

        scanner.close();
    }
}

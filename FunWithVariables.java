import java.util.Scanner;

public class FunWithVariables {
        public static void main(String[] args) {
            System.out.println("~~~ Welcome to my Fun With Variables Program! ~~~\n");

            String message = "This is a simple message.";
            System.out.println("Message: " + message);

            int num1 = 0;
            int num2 = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter a whole number for num1: ");
            num1 = scanner.nextInt();

            System.out.print("Please enter a whole number for num2: ");
            num2 = scanner.nextInt();

            System.out.println("\nYou entered the following numbers:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);

            int sum = num1 + num2;
            System.out.println("The sum of num1 and num2 is: " + sum);

            scanner.close();
        }
    }
import java.util.Scanner;
// SumOfUserNums.java
// GG 8/19/25

// I need to import the scanner class from the
// java.util package - this is how I do that.

public class SumOfUserNums {
    public static void main(String[] args) {
        // Create the Variables needed
        int num1 = 22;
        System.out.println("\n The Value og num1 is" + num1 + "\n");

        int num2 = 0;
        int num3 = 0;
        int sumOfTheInts = 0;
        //get user imput
        // Create a Scanner object named scanner
        Scanner scanner = new Scanner(System.in);
        // Get the first int.
        System.out.println("\n Enter an integer for num1:");
        num1 = scanner.nextInt();


        // Test it
        System.out.println("\n num1 is:"+ num1);
        System.out.println("\n num1 is:"+ num2);
        System.out.println("\n num1 is:"+ num3);

        // add them up!
      sumOfTheInts   = num1 + num2 + num3;

      // Test it!
      System.out.println("\n The sum of the ints is:" + sumOfTheInts);




        }

    }

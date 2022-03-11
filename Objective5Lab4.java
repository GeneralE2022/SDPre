import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int evenOdd = 0;

      System.out.println("Please enter a number to check if it is odd or even: ");
      evenOdd = scanner.nextInt();

      if (evenOdd % 2 == 0) {
        System.out.println(evenOdd + " is even.");
      }

      else {
        System.out.println(evenOdd + " is odd.");
      }

      scanner.close();
  }
}

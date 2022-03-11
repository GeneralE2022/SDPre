import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    birthYear = 2022 - age;

    System.out.println("You were born in " + birthYear);
    input.close();

// This is not always accurate depeneing on if one's birthday has already passed!
// A better way might be to prompt a user to enter their full birth date. 

  }
}

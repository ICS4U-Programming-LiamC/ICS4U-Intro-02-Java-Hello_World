
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How old are you: ");

    String age = myObj.nextLine();  // Read user input
    int IntAge = 0;

    try {
      IntAge = Integer.parseInt(age);
      
      if (IntAge >= 18) {
            System.out.println("You can vote");
          } else {
            System.out.println("You can not vote");
          }

    } catch (NumberFormatException ex){
      System.out.print("You have to put a number dummy");
    }
  }
}
import java.util.Scanner;

/**
 *FizzBuzz program
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
    Scanner input = new Scanner(System.in);


    //ask user to submit a number
    System.out.println("Enter a number to play FizzBuzz");

    //get number from user
    int number = input.nextInt();

    //figure out what they have to say
    if(number % 3 == 0 && number % 5 == 0){
    System.out.println("You should say FizzBuzz");  
    }else if (number % 3 == 0){
      System.out.println("You should say Fizz");
    }else if (number % 5 == 0 ){
      System.out.println("You should say Buzz");
    }else{
      System.out.println("You should say " + number);
    }
  }

    

    
    
   
    }
    


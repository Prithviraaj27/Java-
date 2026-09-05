import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      Random ran = new Random();

      System.out.println("Guess the number between 1 to 10");


      int random = ran.nextInt(10)+1;
      int limit = 5;
      System.out.println("You have 5 chances to guess the number between 1 to 10");

      for(int i=0;i<limit;i++){
          int guess = sc.nextInt();
          if(guess==random){
              System.out.println("You guessed it!");
          } else if(guess>random) {
              System.out.println("your number is too high");
          }else if(guess<random){
              System.out.println("your number is too low");
          }else{
              System.out.println("You Lost ! Better luck next time");
          }
      }
    }
}

import java.util.Scanner;

public class MyFirstProgram {

   
   public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

     System.out.println("You are still playing the game");

     String response = scanner.next();

     if (response.equals("q") || response.equals("Q") ){
        System.out.println("You quit the game!");

     }
 else{
    System.out.println("You are still playing the game *PEW PEW*");
 }
     

     }
}

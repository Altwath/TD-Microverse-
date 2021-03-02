import java.util.Scanner;

public class MyFirstProgram {

   public static void main(String [] args){
              
   Scanner scanner = new Scanner(System.in); //This line here is used for input

   System.out.println("what is your name? "); 
   String name = scanner.nextLine();       //This line is meant for the programe to accept a name. 
   System.out.println("Hello "+name);      //This is the message 

   System.out.println("How old are you?"); //We want the program to accept only integer 
   int age = scanner.nextInt(); //This line is the same as line 10 but it accepts only integrs 
   System.out.println("You are "+age+" years old");

   System.out.println("What is your favorite food?");
   scanner.nextLine();     //We need this line in order to reseat the line. 
   String food = scanner.nextLine();
   System.out.println("you like "+food);      

     }
}

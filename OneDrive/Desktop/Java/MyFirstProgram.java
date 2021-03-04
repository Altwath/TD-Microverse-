import javax.swing.JOptionPane;
import java.util.Scanner;

public class MyFirstProgram {

   static double x;
   static double y;
   static double z;

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter side x: ");
      x = scanner.nextDouble();
      System.out.println("Enter side y: ");
      y = scanner.nextDouble();

      z = Math.sqrt((x * x) + (y * y));
    System.out.println("The hypotenuse is : "+z);
       
    scanner.close();

     }
}

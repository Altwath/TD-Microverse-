import javax.swing.JOptionPane;
public class MyFirstProgram {

   public static void main(String [] args){
              
      String name = JOptionPane.showInputDialog("Type in your name");
      JOptionPane.showMessageDialog(null, "Hello "+ name);
       

     }
}

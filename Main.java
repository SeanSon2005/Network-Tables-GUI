
import javax.swing.JFrame; 
public class Main
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("NTR");
         frame.setSize(1200, 450);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new Panel());
         frame.setVisible(true);
      }
   }
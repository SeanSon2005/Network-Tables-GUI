
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class AdjustmentPanel extends JPanel
{
    private final int num = 10;
    private int size = 0;
    private JLabel[] labels = new JLabel[num];
    private JTextField[] fields = new JTextField[num];


    public AdjustmentPanel(){
        setLayout(new GridLayout(num,2));
        for(int i = 0; i < num; i++){
            labels[i] = new JLabel("PID value");
            labels[i].setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
            labels[i].setForeground(Color.black);
            add(labels[i]);

            fields[i] = new JTextField();
            add(fields[i]);
        }
        input();
        
    }
    public void save(){
        try{
            System.setOut(new PrintStream(new FileOutputStream("PISS\\save"+(SavePanel.getSaveCount()+1)+".txt")));
        }
        catch(Exception er){
            return;
        }
        System.out.println(size);
        for(int i = 0; i < size; ++i){
            System.out.println(Double.parseDouble(fields[i].getText()));
        }
    }
    public void input(){
        Scanner input;
        try{
            input = new Scanner(new File ("PISS//save" + SavePanel.getText() + ".txt"));
        }
        catch(Exception e){
            System.out.println("no such file");
            return;
        }
        size = input.nextInt();
        for(int i = 0; i < size; ++i){
            fields[i].setText(""+input.nextDouble());
        }
        input.close();
    }
}
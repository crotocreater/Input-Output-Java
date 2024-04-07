package View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame{
    public JPanel left, content;
    public void setLeft(int a, int b){
        this.left = new JPanel();
        this.left.setSize(a,b);
        this.left.setBackground(Color.BLACK);
    }
    public void setContent(int a, int b){
        this.content = new JPanel();
        this.content.setSize(a,b);
        this.content.setBackground(Color.green);
    }
    public MainView(){
        this.setTitle("Mini Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1250, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setLayout(new FlowLayout());
        this.setLeft(250, 650);
        this.setContent(1000, 650);
        this.add(this.left);
        this.add(this.content);
    }
}

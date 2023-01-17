
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Scoree.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(40, 100, 400, 300);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " for playing Java Quiz");
        heading.setBounds(150, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(480, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(510, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
         JLabel builder = new JLabel("Powered by-Suprith");
         builder.setBounds(590, 460, 300, 30);
          builder.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
           add(builder);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}

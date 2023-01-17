
package quiz.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Java Quiz");
        heading.setBounds(180, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 800, 350);
        rules.setFont(new Font("Tahoma", Font.BOLD, 16));
        rules.setText(
            "<html>"+ "<br>"+
                    
            "<b>" + "1. NEVER GIVE UP :-   You have to attend all the question and you cannot skip the question" + "<br><br><br>" +
                "2. TIME IS PRECIOUS :-    For every question 15 seconds will be there, try to make use of each" + "<br><br><br>" +
                "3. HONESTY WILL WIN ONE DAY :-    Do not try to malpractice" + "<br><br><br>" +
                "4. YOUR REAL COMPITATOR IS DISTRACTION :-    Be focused until and after quiz " + "<br><br><br>" +
                "5. INKY PINKY PONKY :-    This may be your favourite activity in the games, but don't use that here " + "<br><br><br>" +"</b>"+
                
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}

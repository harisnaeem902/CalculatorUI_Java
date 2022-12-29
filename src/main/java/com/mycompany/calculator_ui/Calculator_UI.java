
package com.mycompany.calculator_ui;
import java.awt.Color;
import javax.swing.JFrame;

public class Calculator_UI 
{

    public static void main(String[] args) 
    {
        calculator c = new calculator();
        c.setTitle("calculator");
        c.intialize();
        c.getContentPane().setBackground(Color.DARK_GRAY);
        c.setSize(500, 600);
        c.setLayout(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}

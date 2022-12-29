
package com.mycompany.calculator_ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener
{
    public int val;
    public int op=0;
    public JTextField txtMain=new JTextField();
    Font f=new Font("Times New Roman",Font.BOLD,32);
    public JButton btn9=new JButton();
    public JButton btn8=new JButton();
    public JButton btn7=new JButton();
    public JButton btn6=new JButton();
    public JButton btn5=new JButton();
    public JButton btn4=new JButton();
    public JButton btn3=new JButton();
    public JButton btn2=new JButton();
    public JButton btn1=new JButton();
    public JButton btn0=new JButton();
    public JButton btneq=new JButton();
    public JButton btnplus=new JButton();
    public JButton btnback=new JButton();
    public void intialize()
    {
        txtMain.setText("0");
        txtMain.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMain.setFont(f);
        txtMain.setBorder(BorderFactory.createLineBorder(Color.CYAN,1));
        txtMain.setEnabled(false);
        txtMain.setBounds(10,10,450,50);
        this.add(txtMain);
        
        btn9.setText("9");
        btn9.setFont(f);
        btn9.setBounds(10,80,80,60);
        btn9.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn9.addActionListener(this);
        this.add(btn9);
        btn8.setText("8");
        btn8.setFont(f);
        btn8.setBounds(120,80,80,60);
        btn8.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn8.addActionListener(this);
        this.add(btn8);
        btn7.setText("7");
        btn7.setFont(f);
        btn7.setBounds(240,80,80,60);
        btn7.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn7.addActionListener(this);
        this.add(btn7);
    
        btn6.setText("6");
        btn6.setFont(f);
        btn6.setBounds(10,180,80,60);
        btn6.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn6.addActionListener(this);
        this.add(btn6);
        
        btn5.setText("5");
        btn5.setFont(f);
        btn5.setBounds(120,180,80,60);
        btn5.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn5.addActionListener(this);
        this.add(btn5);
        
        btn4.setText("4");
        btn4.setFont(f);
        btn4.setBounds(240,180,80,60);
        btn4.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn4.addActionListener(this);
        this.add(btn4);
        
        btn3.setText("3");
        btn3.setFont(f);
        btn3.setBounds(10,280,80,60);
        btn3.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn3.addActionListener(this);
        this.add(btn3);
        
        btn2.setText("2");
        btn2.setFont(f);
        btn2.setBounds(120,280,80,60);
        btn2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn2.addActionListener(this);
        this.add(btn2);
        
        btn1.setText("1");
        btn1.setFont(f);
        btn1.setBounds(240,280,80,60);
        btn1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn1.addActionListener(this);
        this.add(btn1);
    
        btnplus.setText("+");
        btnplus.setFont(f);
        btnplus.setBounds(10,380,80,60);
        btnplus.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btnplus.addActionListener(this);
        this.add(btnplus);
        
        btn0.setText("0");
        btn0.setFont(f);
        btn0.setBounds(120,380,80,60);
        btn0.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btn0.addActionListener(this);
        this.add(btn0);
        
        btneq.setText("=");
        btneq.setFont(f);
        btneq.setBounds(240,380,80,60);
        btneq.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btneq.addActionListener(this);
        this.add(btneq);
        
        btnback.setText("<-");
        btnback.setFont(f);
        btnback.setBounds(240,460,80,60);
        btnback.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        btnback.addActionListener(this);
        this.add(btnback);
    }
    
    /*public class clickEvent implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            String txt=txtMain.getText();
            if(ae.getActionCommand().compareTo("+")==0)
            {
                op=1;
                val=Integer.parseInt(txtMain.getText());
                txtMain.setText("0");
            }
            else
            if(ae.getActionCommand().compareTo("=")==0)
            {
                
                int vint=Integer.parseInt(txtMain.getText());
                int r=0;
                if(op==1)
                {
                r=val+vint;
                }
                txtMain.setText(Integer.toString(r));
            }
            else
            if(txt.compareTo("0")==0)
            {
                txtMain.setText(ae.getActionCommand());
            }
            else
            {
                txtMain.setText(txtMain.getText()+ae.getActionCommand());
            }
            
           // txtMain.setText(ae.getActionCommand());
        }
        
    }*/

    @Override
    public void actionPerformed(ActionEvent ae) 
    { 
        String txt=txtMain.getText();
            if(ae.getActionCommand().compareTo("+")==0)
            {
                op=1;
                val=Integer.parseInt(txtMain.getText());
                txtMain.setText("0");
            }
            else
            if(ae.getActionCommand().compareTo("=")==0)
            {
                
                int vint=Integer.parseInt(txtMain.getText());
                int r=0;
                if(op==1)
                {
                r=val+vint;
                }
                txtMain.setText(Integer.toString(r));
            }
             else
            if(ae.getActionCommand().compareTo("<-")==0)
            {
                
                String str=txtMain.getText();
                
                str=str.substring(0, str.length()-1);
                txtMain.setText(str);
                
                
                if(str.compareTo("")==0)
                {
                    txtMain.setText("0");
                }
            }
            
            else
            if(txt.compareTo("0")==0)
            {
                txtMain.setText(ae.getActionCommand());
            }
            else
            {
                txtMain.setText(txtMain.getText()+ae.getActionCommand());
            }
            
    }
}
    


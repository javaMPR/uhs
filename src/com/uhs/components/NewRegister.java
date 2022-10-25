package com.uhs.components;

import com.uhs.swing.MyPasswordField;
import com.uhs.swing.MyTextArea;
import com.uhs.swing.MyTextField;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import javax.swing.border.*;

public class NewRegister  {
    public NewRegister(){
        JFrame f=new JFrame("Universal Healthcare System");
        JLabel l1=new JLabel("REGISTRATION DETAILS");
        l1.setBounds(500,15,300,30);
        l1.setFont(new Font("Vardana", 1, 20));
        l1.setForeground(Color.white);
        JPanel p=new JPanel();
        p.setLayout(null);
        JLabel l2=new JLabel("FIRST NAME:");
        l2.setFont(new Font("Vardana", Font.BOLD, 16));
        l2.setForeground(new Color(3, 4, 94));
        l2.setBounds(30,20,150,40);
        p.add(l2);
        MyTextField t2=new MyTextField();
        t2.setFont(new Font("Vardana",1,14));
        t2.setBounds(150,20,250,40);
        t2.setHint("First Name");
        p.add(t2);
        JLabel l3=new JLabel("MIDDLE NAME:");
        l3.setFont(new Font("Vardana", 1, 16));
        l3.setForeground(new Color(3, 4, 94));
        l3.setBounds(420,20,150,40);
        p.add(l3);
        MyTextField t3=new MyTextField();
        t3.setFont(new Font("Vardana",1,14));
        t3.setBounds(555,20,250,40);
        t3.setHint("Middle Name");
        p.add(t3);
        JLabel l4=new JLabel("LAST NAME:");
        l4.setFont(new Font("Vardana", Font.BOLD, 16));
        l4.setForeground(new Color(3, 4, 94));
        l4.setBounds(830,20,150,40);
        p.add(l4);
        MyTextField t4=new MyTextField();
        t4.setFont(new Font("Vardana",1,14));
        t4.setBounds(950,20,250,40);
        t4.setHint("Last Name");
        p.add(t4);
        JLabel l5=new JLabel("ADDRESS:");
        l5.setFont(new Font("Vardana", Font.BOLD, 16));
        l5.setForeground(new Color(3, 4, 94));
        l5.setBounds(30,80,150,40);
        p.add(l5);
        MyTextArea ta1=new MyTextArea();
        ta1.setBounds(150,80,1050,60);
        ta1.setFont(new Font("Vardana",1,14));
        ta1.setHint("Address");
        p.add(ta1);
        JLabel l6=new JLabel("State:");
        l6.setFont(new Font("Vardana", Font.BOLD, 16));
        l6.setForeground(new Color(3, 4, 94));
        l6.setBounds(30,161,150,40);
        p.add(l6);
        MyTextField t6=new MyTextField();
        t6.setFont(new Font("Vardana",1,14));
        t6.setBounds(150,161,200,40);
        t6.setHint("State");
        p.add(t6);
        JLabel l7=new JLabel("CITY:");
        l7.setFont(new Font("Vardana", 1, 16));
        l7.setForeground(new Color(3, 4, 94));
        l7.setBounds(360,161,150,40);
        p.add(l7);
        MyTextField t7=new MyTextField();
        t7.setFont(new Font("Vardana",1,14));
        t7.setBounds(420,161,200,40);
        t7.setHint("City");
        p.add(t7);
        JLabel l8=new JLabel("PINCODE:");
        l8.setFont(new Font("Vardana", Font.BOLD, 16));
        l8.setForeground(new Color(3, 4, 94));
        l8.setBounds(630,161,150,40);
        p.add(l8);
        MyTextField t8=new MyTextField();
        t8.setFont(new Font("Vardana",1,14));
        t8.setBounds(730,161,200,40);
        t8.setHint("Pincode");
        p.add(t8);
        JLabel l9=new JLabel("BLOOD GROUP:");
        l9.setFont(new Font("Vardana", Font.BOLD, 16));
        l9.setForeground(new Color(3, 4, 94));
        l9.setBounds(950,161,150,40);
        p.add(l9);
        String bloodgrp[]={"--Select--","A+","A-","B+","B-","AB+","AB-","O+","O-"};
        JComboBox cb=new JComboBox(bloodgrp);
        cb.setBounds(1100, 161,90,40);
        p.add(cb);
        JLabel l10=new JLabel("GENDER: ");
        l10.setFont(new Font("Vardana", Font.BOLD, 16));
        l10.setForeground(new Color(3, 4, 94));
        l10.setBounds(30,235,150,40);
        p.add(l10);
        ButtonGroup bg=new ButtonGroup();
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        bg.add(r1);bg.add(r2);
        p.add(r1);p.add(r2);
        r1.setBounds(130,228,70,60);
        r1.setFocusPainted(false);
        r1.setBorderPainted(false);
        r1.setBackground(Color.white);
        r1.setForeground(new Color(3, 4, 94));
        r1.setFont(new Font("Vardana", Font.BOLD, 12));
        r2.setBounds(200,228,70,60);
        r2.setFocusPainted(false);
        r2.setBorderPainted(false);
        r2.setBackground(Color.white);
        r2.setForeground(new Color(3, 4, 94));
        r2.setFont(new Font("Vardana", Font.BOLD, 12));
        JLabel l11=new JLabel("CONTACT NO:");
        l11.setFont(new Font("Vardana", Font.BOLD, 16));
        l11.setForeground(new Color(3, 4, 94));
        l11.setBounds(290,237,120,40);
        p.add(l11);
        MyTextField t11=new MyTextField();
        t11.setFont(new Font("Vardana",1,14));
        t11.setBounds(420,235,200,40);
        t11.setHint("Contact No");
        p.add(t11);
        JLabel l12=new JLabel("Email:");
        l12.setFont(new Font("Vardana", Font.BOLD, 16));
        l12.setForeground(new Color(3, 4, 94));
        l12.setBounds(660,235,150,40);
        p.add(l12);
        MyTextField t12=new MyTextField();
        t12.setFont(new Font("Vardana",1,14));
        t12.setBounds(730,235,200,40);
        t12.setHint("Email Address");
        p.add(t12);
        JLabel l13=new JLabel("D.O.B:");
        l13.setFont(new Font("Vardana", Font.BOLD, 16));
        l13.setForeground(new Color(3, 4, 94));
        l13.setBounds(950,235,150,40);
        p.add(l13);
        MyTextField t13=new MyTextField();
        t13.setFont(new Font("Vardana",1,14));
        t13.setBounds(1010,235,190,40);
        t13.setHint("-Date-Of-Birth-");
        p.add(t13);
        JLabel l21=new JLabel("EMERGENCY PERSON DETAILS:");
        l21.setFont(new Font("Vardana", Font.BOLD, 16));
        l21.setForeground(new Color(3, 4, 94));
        l21.setBounds(30,290,300,40);
        p.add(l21);/*
        JLabel l22=new JLabel("RELATION TYPE:");
        l22.setFont(new Font("Vardana", Font.BOLD, 16));
        l22.setForeground(new Color(3, 4, 94));
        l22.setBounds(790,260,150,40);
        p.add(l22);
        MyTextField t22=new MyTextField();
        t22.setFont(new Font("Vardana",1,14));
        t22.setBounds(950,260,250,40);
        t22.setHint("-Relation-Type-");
        p.add(t22);
        JLabel l31=new JLabel("FIRST NAME:");
        l31.setFont(new Font("Vardana", Font.BOLD, 16));
        l31.setForeground(new Color(3, 4, 94));
        l31.setBounds(30,315,150,40);
        p.add(l31);
        MyTextField t31=new MyTextField();
        t31.setFont(new Font("Vardana",1,14));
        t31.setBounds(150,315,175,40);
        t31.setHint("Name");
        p.add(t31);*/
        JLabel l32=new JLabel("RELATIONSHIP TO CONTACT:");
        l32.setFont(new Font("Vardana", 1, 16));
        l32.setForeground(new Color(3, 4, 94));
        l32.setBounds(30,345,250,40);
        p.add(l32);
        MyTextField t32=new MyTextField();
        t32.setFont(new Font("Vardana",1,14));
        t32.setBounds(280,345,210,40);
        t32.setHint("Relation Type");
        p.add(t32);
        JLabel l33=new JLabel("EMAIL:");
        l33.setFont(new Font("Vardana", Font.BOLD, 16));
        l33.setForeground(new Color(3, 4, 94));
        l33.setBounds(895,345,150,40);
        p.add(l33);
        MyTextField t33=new MyTextField();
        t33.setFont(new Font("Vardana",1,14));
        t33.setBounds(970,345,230,40);
        t33.setHint("Emergency Contact Email");
        p.add(t33);
        JLabel l36=new JLabel("CONTACT NO:");
        l36.setFont(new Font("Vardana", Font.BOLD, 16));
        l36.setForeground(new Color(3, 4, 94));
        l36.setBounds(510,345,120,40);
        p.add(l36);
        MyTextField t36=new MyTextField();
        t36.setFont(new Font("Vardana",1,14));
        t36.setBounds(650,345,230,40);
        t36.setHint("Emergency Person Contact no");
        p.add(t36);

        JLabel l31=new JLabel("PASSWORD:");
        l31.setFont(new Font("Vardana", Font.BOLD, 16));
        l31.setForeground(new Color(3, 4, 94));
        l31.setBounds(30,410,150,40);
        p.add(l31);
        MyPasswordField t31=new MyPasswordField();
        t31.setFont(new Font("Vardana",1,14));
        t31.setBounds(150,410,250,40);
        t31.setHint("Password");
        p.add(t31);

        JLabel l52=new JLabel("CONFIRM PASSWORD:");
        l52.setFont(new Font("Vardana", Font.BOLD, 16));
        l52.setForeground(new Color(3, 4, 94));
        l52.setBounds(750,410,250,40);
        p.add(l52);
        MyPasswordField t52=new MyPasswordField();
        t52.setFont(new Font("Vardana",1,14));
        t52.setBounds(950,410,250,40);
        t52.setHint("Password");
        p.add(t52);

        JButton b = new JButton("REGISTER");
        b.setForeground(Color.white);
        b.setBackground(new Color(3, 4,94));
        b.setBounds(520, 520, 200, 35);
        b.setFont(new Font("Verdana",Font.BOLD, 14));
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setEnabled(false);
        p.add(b);

        b.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
            String pass=String.valueOf(t31.getPassword());
            String cpass=String.valueOf(t52.getPassword());
            if(pass.equals(cpass)){
                if (pass.isEmpty()||cpass.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Password or Confirm Password not entered ");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Register");
                    DLoginAndRegister lr1=new DLoginAndRegister();
                    f.show();
                    f.dispose();
                }}
            else {
                JOptionPane.showMessageDialog(null,"Password and Confirm Password not matches");
            }
        }});

        JCheckBox r31=new JCheckBox("BY CLICKING,YOU ACCEPT THE TERMS AND CONDITIONS");
        p.add(r31);
        r31.setBounds(440,475,1300,40);
        r31.setFocusPainted(false);
        r31.setBorderPainted(false);
        r31.setBackground(Color.white);
        r31.setForeground(new Color(3, 4, 94));
        r31.setFont(new Font("Vardana", Font.BOLD, 12));
        r31.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state=e.getStateChange();
                if(state==ItemEvent.SELECTED){
                    b.setEnabled(true);
                }
                else {
                    b.setEnabled(false);
                }
            }
        });

        p.setBackground(Color.white);
        p.setBounds(10,50,1265,600);
        f.add(p);
        f.add(l1);
        f.getContentPane().setBackground(new Color(3, 4,94));
        f.setSize(1300, 700);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args){
        new NewRegister();
    }
}

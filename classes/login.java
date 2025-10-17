package classes;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener,MouseListener{
    JPanel loginFormpanel;
    JTextField loginTextbox;
    JPasswordField loginFormPassbox;
    JLabel loginFormuser, LoginFormpass, loginDontaccount, loginFormWelcome, label1;
    ImageIcon main;
    JButton loginBigLogin, adminLoginbtn, customerSignupbtn,goback,fogetpasswordbtn;
    user u  ;
    users us;
    public login(users us)
    {

        ////////////////// FRAME AND PANEL WORKS /////////////////
        setTitle("Login");
        setSize(1366,768);
        loginFormpanel = new JPanel();
        loginFormpanel.setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.us = us;

        loginFormWelcome = new JLabel("User Login");
        loginFormWelcome.setBounds(970,123,220,45);
        loginFormWelcome.setFont(new Font("Roboto",Font.BOLD,30));
        loginFormWelcome.setForeground(Color.WHITE);
        loginFormpanel.add(loginFormWelcome);


        ///////////////// USERNAME TEXT  /////////////////
        loginFormuser = new JLabel("Username:");
        loginFormuser.setBounds(925,220,110,20);
        loginFormuser.setFont(new Font("Roboto",Font.PLAIN,18));
        loginFormuser.setForeground(Color.WHITE);
        loginFormpanel.add(loginFormuser);

        ///////////////// USERNAME TEXTFIELD /////////////////
        loginTextbox =new JTextField();
        loginTextbox.setBounds(925,253,297,28);
        loginTextbox.setForeground(Color.BLACK);
        loginTextbox.setFont(new Font("Roboto",Font.PLAIN,18));
        loginFormpanel.add(loginTextbox);

        ///////////////// PASSWORD TEXT /////////////////
        LoginFormpass = new JLabel("Password:");
        LoginFormpass.setBounds(925,314,100,20);
        LoginFormpass.setFont(new Font("Roboto",Font.PLAIN,18));
        LoginFormpass.setForeground(Color.WHITE);
        loginFormpanel.add(LoginFormpass);

        ///////////////// PASSWORD TEXTBOX /////////////////
        loginFormPassbox =new JPasswordField();
        loginFormPassbox.setBounds(925,343,297,28);
        loginFormPassbox.setFont(new Font("Roboto",Font.PLAIN,18));
        loginFormpanel.add(loginFormPassbox);


        ///////////////// LOGIN BUTTON /////////////////
        loginBigLogin =new JButton();
        loginBigLogin.setText("LOGIN");
        loginBigLogin.setBounds(930,439,297,28);
        loginBigLogin.setForeground(new Color(128,130,130));
        loginBigLogin.setBackground(Color.WHITE);
        loginBigLogin.setFont(new Font("Roboto",Font.BOLD,18));
        loginBigLogin.addActionListener(this);
        loginBigLogin.setFocusable(false);
        loginFormpanel.add(loginBigLogin);

        ///////////////// Don't have an account? Text /////////////////
        loginDontaccount =new JLabel("Don't Have An account?") ;
        loginDontaccount.setBounds(931,515,200,20);
        loginDontaccount.setFont(new Font("Roboto",Font.PLAIN,18));
        loginDontaccount.setForeground(Color.WHITE);
        loginFormpanel.add(loginDontaccount);
        ///////////////// Forget Password Button /////////////////

        fogetpasswordbtn =new JButton("Forget Password?") ;
        fogetpasswordbtn.setFont(new Font("Roboto",Font.PLAIN,18));
        fogetpasswordbtn.setBounds(1062,389,200,20);
        fogetpasswordbtn.setForeground(Color.WHITE);
        fogetpasswordbtn.setFocusable(false);
        fogetpasswordbtn.setBorder(BorderFactory.createEmptyBorder());
        fogetpasswordbtn.setContentAreaFilled(false);
        fogetpasswordbtn.addActionListener(this);
        loginFormpanel.add(fogetpasswordbtn);

        ///////////////// SIGNUP TEXT Text /////////////////
        customerSignupbtn =new JButton("Signup") ;
        customerSignupbtn.setFont(new Font("Roboto",Font.PLAIN,18));
        customerSignupbtn.setBounds(1138,514,60,20);
        customerSignupbtn.setFocusable(false);
        customerSignupbtn.setContentAreaFilled(false);
        customerSignupbtn.setBorder(BorderFactory.createEmptyBorder());
        customerSignupbtn.setForeground(Color.WHITE);
        customerSignupbtn.addActionListener(this);

        loginFormpanel.add(customerSignupbtn);

        //////////////// Login Button /////////////////
        adminLoginbtn   =new JButton() ;
        adminLoginbtn.setText("Admin Login");
        adminLoginbtn.setBounds(925,390,130,21);
        adminLoginbtn.setFont(new Font("Roboto",Font.PLAIN,18));
        adminLoginbtn.setFocusable(false);
        adminLoginbtn.setForeground(Color.WHITE);
        adminLoginbtn.addActionListener(this);
        adminLoginbtn.setContentAreaFilled(false);
        adminLoginbtn.setBorder(BorderFactory.createEmptyBorder());
        loginFormpanel.add(adminLoginbtn);
//GOBACk
        goback = new JButton("Goback");
        goback.setBounds(1242 ,28,95,32);
        goback.setFocusable(false);
        goback.setBackground(Color.WHITE);
        goback.setForeground(new Color(128,130,130));
        goback.addActionListener(this);
        loginFormpanel.add(goback);


        ///////////// BACKGROUND IMAGE ADD  /////////////////
        label1 =new JLabel();
        main = new ImageIcon("images\\login.jpg");
        label1.setBounds(0,0,1366,768);
        label1.setIcon(main);
        loginFormpanel.add(label1);


///////////// SET VISIBILITY TRUE  /////////////////
        this.add(loginFormpanel);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginBigLogin) {
            loginBigLogin.setForeground(new Color(93, 3, 0));
            loginBigLogin.setBackground(Color.WHITE);

            /////////signuP PROCESSES
            String name = loginTextbox.getText();
            String pass = loginFormPassbox.getText();
            users us=new users();
            int index = us.userExists(name);
            if (index != -1) {
                u = us.checkCredentials(index, pass); //checks username and password
                if (u != null) {
                    JOptionPane.showMessageDialog(this, "Login successfull!");
                    dispose();
                    customerPanel dd = new customerPanel(u,us);
                    dd.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this, "Password incorrect!");
                }}
            else {
                JOptionPane.showMessageDialog(this, "User doesn't exist!");
            }

            }
        if (e.getSource() == goback) {
            dispose();
            home m= new home();
            m.setVisible(true);



        }






        if (e.getSource() == adminLoginbtn) {
            dispose();
            admin_login am=new admin_login();
            am.setVisible(true);
        }

        if (e.getSource() == customerSignupbtn) {
            dispose();
            signup_page s=new signup_page(us,this);
        }

        if(e.getSource() ==fogetpasswordbtn)
        {
            dispose();
            forgotPassword ss=new forgotPassword(us,this);
            ss.setVisible(true);

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}











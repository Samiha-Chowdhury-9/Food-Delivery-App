package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class signup_page extends JFrame implements ActionListener, MouseListener {

    JPanel signup_panel;
    ////
    JLabel userLabel, passwordLabel, confirmPassLabel, genderLabel, dobLabel, addressLabel;
    JTextField userTF, addressTF;
    JPasswordField passwordTF, confirmPasswordTF;
    JButton signUpBtn,backBtn;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;
    JComboBox date,month,year;
    Color myColor1, myColor2;
    Font myFont, myFont2;
    ImageIcon icon;
    ImageIcon bgc;
    JLabel label122;
    login lg;
    users us;
    JLabel adminsignup;



    public signup_page(users us, login lg)
    {
        setTitle("User Signup");
        setSize(1366,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        signup_panel =new JPanel();
        signup_panel.setLayout(null);
        setVisible(true);
        ImageIcon mainlogo = new ImageIcon("images\\main-logo.jpg");
        setIconImage(mainlogo.getImage());
        this.lg =lg;
        this.us = us;

//////Colors+fonts

        myColor1 = new Color(191,232,247);
        myColor2 = new Color(236,235,232);
        myFont = new Font("Century",Font.ITALIC, 17);
        myFont2 = new Font("Roboto",Font.BOLD,30);
        ///////adminsignup
        adminsignup =new JLabel("User Signup");
        adminsignup.setBounds(438,150,450,62);
        adminsignup.setForeground(Color.BLACK);
        adminsignup.setFont(new Font("Roboto",Font.BOLD,52));
        signup_panel.add(adminsignup);

        ///username
        userLabel = new JLabel("User name:");
        userLabel.setBounds(472,270,132,28);
        userLabel.setForeground(Color.BLACK);
        userLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        signup_panel.add(userLabel);
        //user texttfield
        userTF = new JTextField();
        userTF.setForeground(Color.BLACK);
        userTF.setBounds(632,266,242,30);
        userTF.setFont(new Font("Roboto",Font.PLAIN,25));

        signup_panel.add(userTF);
        ////
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(481,467,123,27);
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        signup_panel.add(passwordLabel);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(632,463,242,30);
        passwordTF.setFont(new Font("Roboto",Font.PLAIN,25));
        passwordTF.setEchoChar('*');
        signup_panel.add(passwordTF);

        confirmPassLabel = new JLabel("Confirm Password:");
        confirmPassLabel.setForeground(Color.BLACK);
        confirmPassLabel.setBounds(384,521,221,28);
        confirmPassLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        signup_panel.add(confirmPassLabel);

        confirmPasswordTF = new JPasswordField();
        confirmPasswordTF.setBounds(632,515,242,30);
        confirmPassLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        confirmPasswordTF.setEchoChar('*');
        signup_panel.add(confirmPasswordTF);

        genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(512,316,100,28);
        genderLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        genderLabel.setForeground(Color.BLACK);
        signup_panel.add(genderLabel);

        dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(454,415,150,28);
        dobLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        dobLabel.setForeground(Color.BLACK);
        signup_panel.add(dobLabel);

        String dates[]= {"1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16","17",
                "18","19","20","21","22","23","24","25",
                "26","27","28","29","30","31"};
        date = new JComboBox(dates);
        date.setBounds(632,411 ,81,30);
        date.setForeground(Color.BLACK);
        date.setFont(new Font("Roboto",Font.PLAIN,18));
        signup_panel.add(date) ;

        String months[]= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG", "SEP","OCT","NOV","DEC"};
        month = new JComboBox(months);
        month.setBounds(718,411 ,81,30);
        month.setForeground(Color.BLACK);
        month.setFont(new Font("Roboto",Font.PLAIN,18));
        signup_panel.add(month);

        String years[]= {"1990","1991","1992","1993","1994",
                "1995","1996","1997","1998","1999","2000",
                "2001","2002","2003","2004","2005","2006",
                "2007","2008","2009","2010","2011","2012",
                "2013","2014","2015","2016","2017","2018",
                "2019","2020","2021","2022","2023"};
        year = new JComboBox(years);
        year.setBounds(803,411 ,81,30);
        year.setForeground(Color.BLACK);
        year.setFont(new Font("Roboto",Font.PLAIN,18));
        signup_panel.add(year);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(504,365,110,27);
        addressLabel.setFont(new Font("Roboto",Font.PLAIN,25));
        addressLabel.setForeground(Color.BLACK);
        signup_panel.add(addressLabel);

        addressTF = new JTextField();
        addressTF.setForeground(Color.BLACK);
        addressTF.setBounds(632,360,242,30);
        addressTF.setFont(new Font("Roboto",Font.PLAIN,25));
        signup_panel.add(addressTF);

        r1 = new JRadioButton("Male");
        r1.setBounds(630,322,70,20);
        r1.setFont(new Font("Roboto",Font.PLAIN,18));
        signup_panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Roboto",Font.PLAIN,18));
        r2.setBounds(705,322,100,20);
        signup_panel.add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Roboto",Font.PLAIN,18));
        r3.setBounds(810,322,100,20);
        signup_panel.add(r3);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        signUpBtn = new JButton("Sign Up");
        signUpBtn.setBounds(632,564,242,40);
        signUpBtn.setFont(new Font("Roboto",Font.PLAIN,30));
        signUpBtn.setBackground(Color.BLACK);
        signUpBtn.setForeground(Color.WHITE);

        signUpBtn.addActionListener(this);
        signUpBtn.setFocusable(false);
        signup_panel.add(signUpBtn);


        /////////goback

        backBtn = new JButton(icon);
        backBtn = new JButton("Goback");
        backBtn.setBounds(1242 ,28,95,32);
        backBtn.setFocusable(false);
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(new Color(128,130,130));
        backBtn.addActionListener(this);
        signup_panel.add(backBtn);


        ///////////// BACKGROUND IMAGE ADD  /////////////////
        label122 =new JLabel();
        bgc = new ImageIcon("images\\bgg.jpg");
        label122.setBounds(0,0,1366,768);
        label122.setIcon(bgc);
        signup_panel.add(label122);
        this.add(signup_panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(signUpBtn.getText().equals(command)){
            String name ="", pass="", confirmPass="",address="",
                    gender="",dt="",mnth="",yr="";
            String dob="";
            String myPass="";

            name = userTF.getText();
            pass = passwordTF.getText();
            confirmPass = confirmPasswordTF.getText();
            address = addressTF.getText();


            if(r1.isSelected()){ gender = "Male";}
            else if(r2.isSelected()){ gender = "Female";}
            else if(r3.isSelected()){ gender = "Other";}
            else{}

            dt = date.getSelectedItem().toString();
            mnth = month.getSelectedItem().toString();
            yr = year.getSelectedItem().toString();
            dob = dt+"/"+mnth+"/"+yr;

            if((!pass.isEmpty()) && (!confirmPass.isEmpty()) && (pass.equals(confirmPass))){
                myPass = pass;
                if((!name.isEmpty()) && (!gender.isEmpty()) && (!address.isEmpty())){
                    user u = new user(name,myPass,gender,dob,address);
                    users us=new users();
                    us.addUser(u);
                    JOptionPane.showMessageDialog(this, "Sign up successfull. Please login to continue.");

                    login lg= new login(us);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Information missing!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Password missmatch/missing!");
            }
        }
        if (e.getSource() == backBtn) {
            dispose();
            login am=new login(us);
            am.setVisible(true);
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

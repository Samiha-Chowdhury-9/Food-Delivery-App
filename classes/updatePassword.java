package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class updatePassword extends JFrame implements MouseListener, ActionListener{
    JPanel panel;
    JLabel userLabel, passwordLabel, confirmPassLabel,setpasslabel,label1622;
    JPasswordField passwordTF, confirmPasswordTF;
    JButton searchBtn,cancelBtn,updateBtn;
    Color myColor1, myColor2, myColor3;
    Font myFont, myFont2;
    ImageIcon adadd;

    users us;

    String pass="", confirmPass="", newPass="";
    int index = -1;
    public updatePassword(users us,String name,int index){
        super("Upadte password");
        this.setSize(1366,768);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.us = us;
        this.index = index;

        myColor1 = new Color(191,232,247);
        myColor2 = new Color(236,235,232);
        myColor3 = new Color(50,120,0);
        myFont = new Font("Century",Font.ITALIC, 17);
        myFont2 = new Font("Times New Roman",Font.PLAIN, 17);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(myColor2);
        /////////Set pass
        setpasslabel=new JLabel("Set a new password");
        setpasslabel.setBounds(480,226,240,27);
        setpasslabel.setFont(new Font("Raleway",Font.PLAIN,25));
        setpasslabel.setForeground(Color.BLACK);
        panel.add(setpasslabel);


        userLabel = new JLabel("Username: "+ name);
        userLabel.setFont(new Font("Raleway",Font.PLAIN,18));
        userLabel.setBounds(480,291,300,22);
        userLabel.setForeground(Color.BLACK);
        panel.add(userLabel);

        passwordLabel = new JLabel("New Password:");
        passwordLabel.setBounds(451,333,141,22);
        passwordLabel.setFont(new Font("Raleway",Font.PLAIN,18));
        passwordLabel.setForeground(Color.BLACK);

        panel.add(passwordLabel);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(606,326,174,25);
        passwordTF.setEchoChar('*');
        panel.add(passwordTF);

        confirmPassLabel = new JLabel("Confirm Password:");
        confirmPassLabel.setBounds(424,374,173,22);
        confirmPassLabel.setFont(new Font("Raleway",Font.PLAIN,18));
        confirmPassLabel.setForeground(Color.BLACK);
        panel.add(confirmPassLabel);

        confirmPasswordTF = new JPasswordField();
        confirmPasswordTF.setBounds(606,372,174,25);
        confirmPasswordTF.setFont(myFont2);
        confirmPasswordTF.setEchoChar('*');
        panel.add(confirmPasswordTF);
//////////////update Icon
        updateBtn = new JButton("Update");
        updateBtn.setBounds(480,420,299,24);
        updateBtn.setBackground(Color.GREEN);
        updateBtn.setForeground(Color.WHITE);
        updateBtn.addMouseListener(this);
        updateBtn.addActionListener(this);
        updateBtn.setFocusable(false);
        panel.add(updateBtn);
        
        cancelBtn = new JButton("Goback");
        cancelBtn.setBounds(1242 ,28,95,32);
        cancelBtn.setFocusable(false);
        cancelBtn.setBackground(Color.WHITE);
        cancelBtn.setForeground(new Color(128,130,130));
        cancelBtn.addActionListener(this);
        panel.add(cancelBtn);


        panel.add(cancelBtn);
        ///updatePass
        ///////////// BACKGROUND IMAGE ADD  /////////////////
        label1622 =new JLabel();
        adadd = new ImageIcon("images\\bg2.jpg");
        label1622.setBounds(0,0,1366,768);
        label1622.setIcon(adadd);
        panel.add(label1622);
        this.add(panel);
        //this.setVisible(true);


    }

    public void mouseClicked(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}

    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        if(updateBtn.getText().equals(command)){
            pass = passwordTF.getText();
            confirmPass = confirmPasswordTF.getText();
            if((!pass.isEmpty()) && (!confirmPass.isEmpty()) && (pass.equals(confirmPass))){
                newPass = pass;
                user u = us.getUser(index);

                //keeping the old info
                String oldName = u.getName();
                String oldPass = u.getPassword();
                String oldGender = u.getGender();
                String oldDOB = u.getDOB();
                String oldAddress = u.getAddress();

                user oldUser = new user(oldName,oldPass,oldGender,oldDOB,oldAddress);

                //updating the password
                u.setPassword(newPass);

                //also updating in file
                us.updateUser(oldUser,u);

                JOptionPane.showMessageDialog(this, "Password updated. Please login to continue.");
                new login(us);
                //lg.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Password missmatch!");
            }
        }else if(cancelBtn.getText().equals(command)){
             new login(us);
            //lg.setVisible(true);
            this.setVisible(false);
        }else{}
    }
}
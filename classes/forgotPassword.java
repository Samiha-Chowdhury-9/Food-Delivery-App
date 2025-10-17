package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class forgotPassword extends JFrame implements MouseListener, ActionListener{
    JPanel panel;
    JLabel userLabel,label622;
    JTextField userTF;;
    JButton searchBtn,cancelBtn;
    Color myColor1, myColor2;
    Font myFont, myFont2;
    JLabel enterusernamepass;
    login lg;
    users us;
    user u;
    ImageIcon adad;

    public forgotPassword(users us, login lg){
        super("Forgot password");
        this.setSize(1366,768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.lg =lg;
        this.us = us;
        this.u= u;

        myColor1 = new Color(191,232,247);
        myColor2 = new Color(236,235,232);
        myFont = new Font("Century",Font.ITALIC, 17);
        myFont2 = new Font("Times New Roman",Font.PLAIN, 17);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(myColor2);

        userLabel = new JLabel("Forgot Password?");
        userLabel.setBounds(495,323,220,28);
        userLabel.setFont(new Font("Roboto",Font.BOLD,25));
        userLabel.setForeground(Color.BLACK);
        panel.add(userLabel);
///////////enterusernamepass
        enterusernamepass=new JLabel("Enter your username to reset your password");
        enterusernamepass.setBounds(430,358,400,18);
        enterusernamepass.setForeground(Color.BLACK);
        enterusernamepass.setFont(new Font("Roboto",Font.PLAIN,16));
        panel.add(enterusernamepass);
        ///////////
        userTF = new JTextField();
        userTF.setBounds(450,391,314,24);
        userTF.setForeground(Color.BLACK);
        userTF.setFont(new Font("Roboto",Font.PLAIN,16));
        panel.add(userTF);
///////////////////search and submit

        searchBtn = new JButton("Search");
        searchBtn.setBounds(500,436,242,30);
        searchBtn.setFont(new Font("Roboto",Font.PLAIN,20));
        searchBtn.setFocusable(false);
        searchBtn.addActionListener(this);
        panel.add(searchBtn);


        cancelBtn = new JButton("Goback");
        cancelBtn.setBounds(1240 ,28,100,32);
        cancelBtn.setFont(new Font("Roboto",Font.PLAIN,18));
        cancelBtn.setFocusable(false);
        cancelBtn.setBackground(Color.WHITE);
        cancelBtn.setForeground(new Color(128,130,130));
        cancelBtn.addActionListener(this);
        panel.add(cancelBtn);

                ///////////// BACKGROUND IMAGE ADD  /////////////////
                label622 =new JLabel();
        adad = new ImageIcon("images\\bg2.jpg");
        label622.setBounds(0,0,1366,768);
        label622.setIcon(adad);
        panel.add(label622);

        this.add(panel);
    }

    public void mouseClicked(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}

    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        if(searchBtn.getText().equals(command)){
            String name = userTF.getText();
            users us=new users();
            int index = us.userExists(name);

            if(index!=-1){
                updatePassword up = new updatePassword(us,name,index);
                up.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Username doesn't exist!");
            }
        }else if(cancelBtn.getText().equals(command)){
          new login(us);
            this.setVisible(false);
        }else{}
    }
}
package classes;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class admin_login extends JFrame implements ActionListener{

    JPanel panel;
    JLabel username,userlgn,pass,image;
    JTextField textbox;
    JPasswordField passbox;
    JButton loginbtn,goback;

    ImageIcon bg;

    users us ;
        user u;

    public admin_login()
    {
        setTitle("Admin Login");
        setSize(1366,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        this.us=us;
        this.u=u;
        panel=new JPanel();
        panel.setLayout(null);

        userlgn = new JLabel("Admin Login");
        userlgn.setBounds(978,123,250,45);
        userlgn.setFont(new Font("Roboto",Font.BOLD,35));
        userlgn.setForeground(Color.WHITE);
        panel.add(userlgn);
////
        username = new JLabel("Username:");
        username.setBounds(925,220,110,20);
        username.setFont(new Font("Roboto",Font.PLAIN,18));
        username.setForeground(Color.WHITE);
        panel.add(username);
///
        textbox =new JTextField();
        textbox.setBounds(925,253,297,28);
        textbox.setForeground(Color.BLACK);
        textbox.setFont(new Font("Roboto",Font.PLAIN,18));
        panel.add(textbox);

        ////pass
        pass = new JLabel("Password:");
        pass.setBounds(925,314,100,20);
        pass.setFont(new Font("Roboto",Font.PLAIN,18));
        pass.setForeground(Color.WHITE);
        panel.add(pass);



        passbox =new JPasswordField();
        passbox.setBounds(925,343,297,28);
        passbox.setFont(new Font("Roboto",Font.PLAIN,18));
        panel.add(passbox);
        ////LOGIN BIG BOX
        loginbtn =new JButton();
        loginbtn.setText("LOGIN");
        loginbtn.setBounds(935,417,297,40);
        loginbtn.setForeground(new Color(128,130,130));
        loginbtn.setBackground(Color.WHITE);
        loginbtn.setFont(new Font("Roboto",Font.BOLD,30));
        loginbtn.addActionListener(this);
        loginbtn.setFocusable(false);
        panel.add(loginbtn);

        goback = new JButton("Goback");
        goback.setBounds(1242 ,28,95,32);
        goback.setFocusable(false);
        goback.setBackground(Color.WHITE);
        goback.setForeground(new Color(128,130,130));
        goback.addActionListener(this);
        panel.add(goback);

 //IMAGE ADD
        image =new JLabel();
        bg=new ImageIcon("images\\login.jpg");
        //setIconImage(bg.getImage());
        image.setIcon(bg);
        image.setBounds(0,0,1366,768);
        panel.add(image);


        this.add(panel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (e.getSource() == goback) {
            dispose();
            login m= new login(us);
            m.setVisible(true);
        }

        if(e.getSource()== loginbtn) {

            if(loginbtn.getText().equals(command)){
                String name = textbox.getText();
                String pass = passbox.getText();
                if(name.equals("admin") && pass.equals("admin")){
                    dispose();
                    admindashboard gsg =new admindashboard();
                    gsg.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid username/password!");
                }


        }
        }

        }}


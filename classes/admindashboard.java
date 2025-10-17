package classes;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class admindashboard extends JFrame implements ActionListener {
    JPanel panel;
    JButton ohistory;
    JLabel admin,label12;
    JButton logout;
    ImageIcon mainicon;


    public admindashboard()
    {
        this.setTitle("Admin Dashboard");
        this.setSize(1366,768);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel=new JPanel();
        panel.setLayout(null);
   //adm,om
        admin=new JLabel("Admin Dashboard");
        admin.setBounds(981  ,174,370,45);
        admin.setForeground(Color.WHITE);
        admin.setFont(new Font("Roboto",Font.BOLD,35));
        panel.add(admin);

//////////////Order History Button
        ohistory =new JButton("History");
        ohistory.setBounds(1035  ,290,207,66);
        ohistory.setFont(new Font("Roboto",Font.PLAIN,40));
        ohistory.addActionListener(this);
        ohistory.setForeground(new Color(128,130,130));
        ohistory.setBackground(Color.WHITE);
        ohistory.setFocusable(false);
        panel.add(ohistory);


//button logou

        logout = new JButton("Logout");
        logout.setFont(new Font("Roboto",Font.PLAIN,20));
        logout.setBounds(1220,28,110,32);
        logout.setForeground(new Color(128,130,130));
        logout.setBackground(Color.WHITE);
        logout.setFocusable(false);
        logout.addActionListener(this);
        panel.add(logout);

        ///////////// BACKGROUND IMAGE ADD  /////////////////
        label12 =new JLabel();
        mainicon = new ImageIcon("images\\admin.jpg");
        label12.setBounds(0,0,1366,768);
        label12.setIcon(mainicon);
        panel.add(label12);


        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== logout)
        {
            dispose();
            admin_login m= new admin_login();
            m.setVisible(true);
        }
        if(e.getSource()== ohistory)
        {
            dispose();
            order_history_page msdf= new order_history_page();

        }



    }
}

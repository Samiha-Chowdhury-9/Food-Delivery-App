package classes;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class customerPanel extends JFrame implements ActionListener {
    JPanel panel;
    JButton placeOrder, mydetails;
    JLabel label12;
    JButton logout;
    ImageIcon amain;
    users us;
        user u;



    public customerPanel(user u,users us)
    {
        this.setTitle("Customer Panel");
        this.setSize(1366,768);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel=new JPanel();
        panel.setLayout(null);
        //adm,om
        this.us=us;
        this.u=u;

//////////////Place Order Button
        placeOrder =new JButton("Place Order");
        placeOrder.setBounds(260  ,290,275,60);
        placeOrder.setFont(new Font("Roboto",Font.PLAIN,40));
        placeOrder.addActionListener(this);
        placeOrder.setBackground(new Color(214,209,37));
        placeOrder.setForeground(Color.BLACK);
        placeOrder.setFocusable(false);
        panel.add(placeOrder);
//////////////Order History Button
        mydetails =new JButton("My Details");
        mydetails.setBounds(260  ,409,275,60);
        mydetails.setFont(new Font("Roboto",Font.PLAIN,40));
        mydetails.addActionListener(this);
        mydetails.setBackground(new Color(214,209,37));
        mydetails.setForeground(Color.BLACK);
        placeOrder.setFocusable(false);
        panel.add(mydetails);

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
        amain = new ImageIcon("images\\bg.jpg");
        label12.setBounds(0,0,1366,768);
        label12.setIcon(amain);
        panel.add(label12);

        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== logout)
        {
            dispose();
            login m= new login(us);
            m.setVisible(true);
        }
        ///////BUTTOON WORKS//////
        if(e.getSource()== placeOrder)
        {
            dispose();
            customerdashboard msdf= new customerdashboard(u,us);
            msdf.setVisible(true);

        }
        if(e.getSource()== mydetails)
        {
            dispose();
            dashBoard ds= new dashBoard(u,us);
            ds.setVisible(true);

        }



    }
}

package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame implements ActionListener {
    JPanel home_panel;
    ImageIcon home;
    JLabel label1;
    JButton startshop;
    users us;

    public home()
    {
        ////////////////// FRAME AND PANEL WORKS /////////////////
        setTitle("Home");
        setSize(1366,768);
        home_panel = new JPanel();
        home_panel.setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        this.us=us;




////////////////// Start Shopping Buttons/////////////////
        startshop=new JButton("Start Ordering");
        startshop.setBounds(996,87,280,65);
        startshop.setBackground(new Color(96,3,0));
        startshop.setFont(new Font("Roboto",Font.PLAIN,20));
        startshop.setForeground(Color.WHITE);
        startshop.setBackground(Color.RED);
        startshop.setFocusable(false);
        startshop.addActionListener(this);
        home_panel.add(startshop);



        ///////////// BACKGROUND IMAGE ADD  /////////////////
        label1 =new JLabel();
        home = new ImageIcon("images\\home.jpg");
        label1.setBounds(0,0,1366,768);
        label1.setIcon(home);
        home_panel.add(label1);


///////////// SET VISIBILITY TRUE  /////////////////
        this.add(home_panel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startshop) {
            dispose();
            login am=new login(us);
            am.setVisible(true);
        }


    }
}














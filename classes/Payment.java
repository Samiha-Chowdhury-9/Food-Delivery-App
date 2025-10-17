package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{

    JPanel order_history_panel;
    JLabel image;

    JButton payment_goback, Bkash, Cash_on_Deliverybtn;



    ImageIcon bg;

    users us;
    user u;
    double fg;
    double totalAmount;
   public Payment(double totalAmount)
    {
        setTitle("Payment Portal");
        setSize(1366,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        order_history_panel =new JPanel();
        order_history_panel.setLayout(null);
        this.fg=fg;
        this.u=u;
        this.totalAmount=totalAmount;
/////////////////////////Bkashs Buttons////////////
            Bkash =new JButton("Bkash");
              Bkash.setForeground(Color.WHITE);
              Bkash.setBackground(new Color(118,166,168));
        Bkash.setFont(new Font("Roboto",Font.PLAIN,35));
             Bkash.setBounds(594,260,160,63);
            Bkash.setFocusable(false);
            Bkash.addActionListener(this);
            order_history_panel.add(Bkash);


        Cash_on_Deliverybtn =new JButton("Cash On Delivery");
        Cash_on_Deliverybtn.setBounds(495,360,360,63);
        Cash_on_Deliverybtn.setFont(new Font("Roboto",Font.PLAIN,35));
        Cash_on_Deliverybtn.setBackground(new Color(118,166,168));
        Cash_on_Deliverybtn.setForeground(Color.WHITE);
        Cash_on_Deliverybtn.setFocusable(false);
        Cash_on_Deliverybtn.addActionListener(this);
        order_history_panel.add(Cash_on_Deliverybtn);

        //Select label
        JLabel selectlabel =new JLabel("Please Select an option to pay");
        selectlabel.setBounds(425,138,700,44);
        selectlabel.setForeground(Color.BLACK);
        selectlabel.setFont(new Font("Roboto",Font.PLAIN,40));
        order_history_panel.add(selectlabel);
//////total billlabel
        JLabel totalbilllabel =new JLabel("Total Bill: "+totalAmount);
        totalbilllabel.setBounds(494,448,500,45);
        totalbilllabel.setFont(new Font("Roboto",Font.PLAIN,30));
        order_history_panel.add(totalbilllabel);


        payment_goback = new JButton("Goback");
        payment_goback.setBounds(1242 ,28,95,32);
        payment_goback.setFocusable(false);
        payment_goback.setBackground(Color.WHITE);
        payment_goback.setForeground(new Color(128,130,130));
        payment_goback.addActionListener(this);
        order_history_panel.add(payment_goback);


        //IMAGE ADD
        image =new JLabel();
        bg=new ImageIcon("images\\bg2.jpg");
        image.setIcon(bg);
        image.setBounds(0,0,1366,768);
        order_history_panel.add(image);
        this.add(order_history_panel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payment_goback) {
            dispose();
            customerdashboard wwd = new customerdashboard(u,us);
            wwd.setVisible(true);
        }
        if (e.getSource() == Bkash) {
            this.setVisible(false);
            bkashpayment wswd = new bkashpayment(totalAmount);
            wswd.setVisible(true);
        }
        if (e.getSource() == Cash_on_Deliverybtn) {
            this.setVisible(false);

            codpayment wwd = new codpayment(totalAmount);
            wwd.setVisible(true);
        }

    }
}
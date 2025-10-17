package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class codpayment extends JFrame implements ActionListener {

    JPanel codpaymentpanel;
    JLabel image;

    JButton payment_goback,paynow;

    JLabel addresstext,totalprice;
    JTextField addressbox;


    ImageIcon bg;
    user u;
    users us;
    double totalAmount;
    double fg;

    public codpayment(double totalAmount)
    {
        setTitle("COD Payment");
        setSize(1366,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.fg=fg;
        this.u=u;
        this.totalAmount=totalAmount;

        codpaymentpanel =new JPanel();
        codpaymentpanel.setLayout(null);
/////////////////////////////////////////////////////
        /////////////////////address text //
        addresstext =new JLabel("Address:");
        addresstext.setFont(new Font("Roboto",Font.PLAIN,28));
        addresstext.setBounds(287,257,120,32);
        codpaymentpanel.add(addresstext);

 /////////////////////Addressbox //
        addressbox =new JTextField();
        addressbox.setFont(new Font("Roboto",Font.PLAIN,20));
        addressbox.setBounds(444,249,595,48);
        codpaymentpanel.add(addressbox);

        ////Total Price
        totalprice=new JLabel("Total Price: "+totalAmount);
        totalprice.setFont(new Font("Roboto",Font.PLAIN,18));
        totalprice.setBounds(530,422,400,20);
        codpaymentpanel.add(totalprice);

                //////////PAY NOW BIG BUTTON
        paynow=new JButton("Confirm Order");
        paynow.setFont(new Font("Roboto",Font.BOLD,48));
        paynow.setBounds(481,446,404,98);
        paynow.setBackground(new Color(246,135,31));
        paynow.setForeground(Color.WHITE);
        paynow.setFocusable(false);
        paynow.setOpaque(true);
        paynow.addActionListener(this);
        codpaymentpanel.add(paynow);


        payment_goback = new JButton("Goback");
        payment_goback.setBounds(1242 ,28,95,32);
        payment_goback.setFocusable(false);
        payment_goback.setBackground(Color.WHITE);
        payment_goback.setForeground(new Color(128,130,130));
        payment_goback.addActionListener(this);
        codpaymentpanel.add(payment_goback);
        //IMAGE ADD
        image =new JLabel();
        bg=new ImageIcon("images\\bg2.jpg");
        image.setIcon(bg);
        image.setBounds(0,0,1366,768);
        codpaymentpanel.add(image);
        this.add(codpaymentpanel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payment_goback) {
            this.setVisible(false);
            Payment sd = new Payment(totalAmount);
            sd.setVisible(true);
        }
        String address ="";
        address = addressbox.getText();

        if (e.getSource() == paynow) {
            if(!address.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Payment complete! Thank you for Ordering.");
                saveOrderHistory(address, totalAmount, "Cash On Delivery");

                int dialog = JOptionPane.YES_NO_OPTION;
                int result = JOptionPane.showConfirmDialog(this, "Do you want to stay on this page?", "Stay on this page?", dialog);
                if (result == 0) {

                }
                else {
                    dispose();
                    customerdashboard db = new customerdashboard(u, us);
                    db.setVisible(true);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Information missing!");
            }
        }
    }
    private void saveOrderHistory(String address, double orderAmount, String paymentType) {
        try (FileWriter writer = new FileWriter("Files/order_history.txt", true)) {

            String orderDetails = String.format("%s | $%.2f | %s\n", address, orderAmount, paymentType);
            writer.write(orderDetails);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  double getTotalAmount() {
        return totalAmount;
    }

}
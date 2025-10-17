package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class bkashpayment extends JFrame implements ActionListener {
    JPanel mobilebankingpayment_panel;
    JLabel image,addresstext;

    JButton payment_goback,mobilebankingbtn,paynow;
    JTextField phonebox,addressbox;
    JLabel enterphnno,totalprice,passtext;

    JPasswordField passwordbox;
    ImageIcon bg;
    user u;
    users us;
    double totalAmount;

    public bkashpayment(double totalAmount)
    {
        setTitle("Bkash Payment");
        setSize(1366,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.u=u;
        this.us=us;
        this.totalAmount = totalAmount;
        mobilebankingpayment_panel =new JPanel();
        mobilebankingpayment_panel.setLayout(null);




        enterphnno=new JLabel("Enter Your Phone No:");
        enterphnno.setFont(new Font("Roboto",Font.PLAIN,28));
        enterphnno.setBounds(384,141,290,32);
        mobilebankingpayment_panel.add(enterphnno);

        phonebox=new JTextField();
        phonebox.setFont(new Font("Roboto",Font.PLAIN,20));
        phonebox.setBounds(384,184,595,48);
        mobilebankingpayment_panel.add(phonebox);

        //////////address text
        addresstext=new JLabel("Address:");
        addresstext.setFont(new Font("Roboto",Font.PLAIN,28));
        addresstext.setBounds(384,253,120,32);
        mobilebankingpayment_panel.add(addresstext);

        ////////////////////passwordbox//
        addressbox=new JTextField();
        addressbox.setFont(new Font("Roboto",Font.PLAIN,20));
        addressbox.setBounds(384,295,595,48);
        mobilebankingpayment_panel.add(addressbox);

        //////////password text
        passtext=new JLabel("Password:");
        passtext.setFont(new Font("Roboto",Font.PLAIN,28));
        passtext.setBounds(384,363,150,32);
        mobilebankingpayment_panel.add(passtext);
        /////////////////////passwordbox//
        passwordbox=new JPasswordField();
        passwordbox.setFont(new Font("Roboto",Font.PLAIN,20));
        passwordbox.setBounds(384,406,251,48);
        mobilebankingpayment_panel.add(passwordbox);
        ////Total Price
        totalprice=new JLabel("Total Price:"+totalAmount);
        totalprice.setFont(new Font("Roboto",Font.PLAIN,28));
        totalprice.setBounds(384,456,300,32);
        mobilebankingpayment_panel.add(totalprice);

        //////////PAY NOW BIG BUTTON
        paynow=new JButton("PAY NOW");
        paynow.setFont(new Font("Roboto",Font.BOLD,30));
        paynow.setBounds(542,601,281,98);
        paynow.setBackground(new Color(246,135,31));
        paynow.setForeground(Color.WHITE);
        paynow.setFocusable(false);
        paynow.setOpaque(true);
        paynow.addActionListener(this);
        mobilebankingpayment_panel.add(paynow);


        payment_goback = new JButton("Goback");
        payment_goback.setBounds(1242 ,28,95,32);
        payment_goback.setFocusable(false);
        payment_goback.setBackground(Color.WHITE);
        payment_goback.setForeground(new Color(128,130,130));
        payment_goback.addActionListener(this);
        mobilebankingpayment_panel.add(payment_goback);

        //IMAGE ADD
        image =new JLabel();
        bg=new ImageIcon("images\\bg2.jpg");
        image.setIcon(bg);
        image.setBounds(0,0,1366,768);
        mobilebankingpayment_panel.add(image);
        this.add(mobilebankingpayment_panel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payment_goback) {
            this.setVisible(false);
            Payment sd = new Payment(totalAmount);
            sd.setVisible(true);
        }
        if (e.getSource() == mobilebankingbtn) {
            this.setVisible(false);
            Payment sd = new Payment(totalAmount);
            sd.setVisible(true);
        }
         String name ="",password="";
        name = phonebox.getText();
        password = passwordbox.getText();



        if (e.getSource() == paynow) {
            if(!name.isEmpty() && !password.isEmpty() )
            {
                saveOrderHistory(name, totalAmount, "Bkash Payment");
                JOptionPane.showMessageDialog(null, "Payment complete! Thank you for Ordering.");
                int dialog = JOptionPane.YES_NO_OPTION;
                int result = JOptionPane.showConfirmDialog(this, "Do you want to stay on this page?", "Stay on this page?", dialog);
                if(result == 0){
                    //do nothing
                }else{
                    customerdashboard db = new customerdashboard(u,us);
                    db.setVisible(true);
                    dispose();
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Information missing!");
            }

        }
    }
    private void saveOrderHistory(String customerName, double orderAmount, String paymentType) {
        try (FileWriter writer = new FileWriter("Files/order_history.txt", true)) {
            String orderDetails = String.format("%s | $%.2f | %s\n", customerName, orderAmount, paymentType);
            writer.write(orderDetails);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
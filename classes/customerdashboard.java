package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class customerdashboard extends JFrame implements ActionListener {
    JButton ap, main, des, addToCart;
    private DefaultListModel<String> cartListModel;
    private JList<String> cartList;

    private JLabel totalPriceLabel;
    private double totalAmount;

    JPanel userpanel;
    JLabel userlabel;

    JButton userlgout;

    ImageIcon a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

    users us;
    user u;
    ImageIcon lgicon, customericon2;
    JLabel customerbg;


    JButton payment_goback;

    public customerdashboard(user u, users us) {
        // FRAME SETTINGS
        setTitle("Customer Dashboard");
        setSize(1366, 768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.u = u;
        this.us = us;


        // PANEL SETTINGS
        userpanel = new JPanel();
        userpanel.setLayout(null);
        /////////



        // LOGOUT BUTTON
        lgicon = new ImageIcon("images\\logoutsmall.png");
        userlgout = new JButton(lgicon);
        userlgout.setBounds(935, 29, 32, 30);
        userlgout.setFocusable(false);
        userlgout.addActionListener(this);
        userlgout.setBorder(BorderFactory.createEmptyBorder());
        userlgout.setContentAreaFilled(false);
        userpanel.add(userlgout);


//////////////////Cart list label
        ImageIcon carticon2=new ImageIcon("images\\carticon.png");
        JLabel cartlistlabel = new JLabel(carticon2);
        cartlistlabel.setBounds(710, 158, 150, 30);
        userpanel.add(cartlistlabel);

/////Labels
        //////////Image adding
        a1 =new ImageIcon("images\\food1.jpg");
        a2 =new ImageIcon("images\\food2.jpg");
        a3 =new ImageIcon("images\\food3.jpg");
        a4 =new ImageIcon("images\\food4.jpg");
        a5 =new ImageIcon("images\\food5.jpg");
        a6 =new ImageIcon("images\\food6.jpg");
        a7 =new ImageIcon("images\\food7.jpg");
        a8 =new ImageIcon("images\\food8.jpg");
        a9 =new ImageIcon("images\\food9.jpg");
        a10 =new ImageIcon("images\\food10.jpg");
        a11 =new ImageIcon("images\\food11.jpg");
        a12= new ImageIcon("images\\food12.jpg");

        //////////Labels adding
        l1 =new JLabel(a1);
        l2 =new JLabel(a2);
        l3 =new JLabel(a3);
        l4 =new JLabel(a4);
        l5 =new JLabel(a5);
        l6 =new JLabel(a6);
        l7 =new JLabel(a7);
        l8 =new JLabel(a8);
        l9 =new JLabel(a9);
        l10 =new JLabel(a10);
        l11 =new JLabel(a11);
        l12= new JLabel(a12);




        //  CART LIST JLIST
        cartListModel = new DefaultListModel<>();
        cartList = new JList<>(cartListModel);
        cartList.setBorder(new EmptyBorder(20, 10, 20, 10));
        cartList.setBackground(Color.WHITE);
        cartList.setOpaque(true);
        cartList.setForeground(Color.BLACK);
        cartList.setFont(new Font("Roboto", Font.PLAIN, 16));


//MEnu1111

        l1.setBounds(64,76,100,120);
        userpanel.add(l1);
        JLabel item1Label = new JLabel("Big Burger $280");
        item1Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item1Label.setBounds(38, 210, 152, 23);
        item1Label.setForeground(Color.BLACK);
        userpanel.add(item1Label);

        ImageIcon plusicon=new ImageIcon("images\\addtocart.png");
        JButton cartButton1 = createCartButton(item1Label);
        cartButton1.setIcon(plusicon);
        cartButton1.setContentAreaFilled(false);
        cartButton1.setBounds(38, 238, 152, 24);
        userpanel.add(cartButton1);
//MEnu22
        l2.setBounds(275,76,100,120);
        userpanel.add(l2);
        JLabel item2Label = new JLabel("Pizza  $220");
        item2Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item2Label.setBounds(262, 215, 120, 23);
        item2Label.setForeground(Color.BLACK);
        userpanel.add(item2Label);

        ImageIcon plusicon3=new ImageIcon("images\\addtocart.png");
        JButton cartButton2 = createCartButton(item2Label);
        cartButton2.setIcon(plusicon3);
        cartButton2.setContentAreaFilled(false);
        cartButton2.setBorder(BorderFactory.createEmptyBorder());
        cartButton2.setBounds(248, 238, 152, 24);
        userpanel.add(cartButton2);
//MEnu3
        l3.setBounds(64,305,100,120);
        userpanel.add(l3);
        JLabel item3Label = new JLabel("Sandwich $120");
        item3Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item3Label.setBounds(45, 445, 136, 23 );
        item3Label.setForeground(Color.BLACK);
        userpanel.add(item3Label);

        ImageIcon plusicon4 =new ImageIcon("images\\addtocart.png");
        JButton cartButton3 = createCartButton(item3Label);
        cartButton3.setIcon(plusicon4);
        cartButton3.setContentAreaFilled(false);
        cartButton3.setBorder(BorderFactory.createEmptyBorder());
        cartButton3.setBounds(38, 470, 152, 24);
        userpanel.add(cartButton3);
//MEnu4
        l4.setBounds(275,305,100,120);
        userpanel.add(l4);
        JLabel item4Label = new JLabel("Chicken Fry $200");
        item4Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item4Label.setBounds(230, 445 , 180, 24);
        item4Label.setForeground(Color.BLACK);
        userpanel.add(item4Label);

        ImageIcon plusicon5 =new ImageIcon("images\\addtocart.png");
        JButton cartButton4 = createCartButton(item4Label);
        cartButton4.setIcon(plusicon5);
        cartButton4.setContentAreaFilled(false);
        cartButton4.setBorder(BorderFactory.createEmptyBorder());
        cartButton4.setBounds(248, 470, 152, 24);
        userpanel.add(cartButton4);
//MEnu5
        l5.setBounds(64,547,100,120);
        userpanel.add(l5);
        JLabel item5Label = new JLabel("French Fry $100");
        item5Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item5Label.setBounds(45, 667, 155, 23);
        item5Label.setForeground(Color.BLACK);
        userpanel.add(item5Label);

        ImageIcon plusicon6 =new ImageIcon("images\\addtocart.png");
        JButton cartButton5 = createCartButton(item5Label);
        cartButton5.setIcon(plusicon6);
        cartButton5.setContentAreaFilled(false);
        cartButton5.setBorder(BorderFactory.createEmptyBorder());
        cartButton5.setBounds(38, 690, 152, 24);
        userpanel.add(cartButton5);
//MEnu6
        l6.setBounds(274,547,100,120);
        userpanel.add(l6);
        JLabel item6Label = new JLabel("Nugget $200");
        item6Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item6Label.setBounds(257, 667, 140, 23);
        item6Label.setForeground(Color.BLACK);
        userpanel.add(item6Label);

        ImageIcon plusicon7 =new ImageIcon("images\\addtocart.png");
        JButton cartButton6 = createCartButton(item6Label);
        cartButton6.setIcon(plusicon5);
        cartButton6.setContentAreaFilled(false);
        cartButton6.setBorder(BorderFactory.createEmptyBorder());
        cartButton6.setBounds(248, 690, 152, 24);
        userpanel.add(cartButton6);
//MEnu7
        l7.setBounds(1000,76,100,120);
        userpanel.add(l7);
        JLabel item7Label = new JLabel("Grill Chicken $200");
        item7Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item7Label.setBounds(985, 215, 152, 23);
        item7Label.setForeground(Color.BLACK);
        userpanel.add(item7Label);

        ImageIcon plusicon8 =new ImageIcon("images\\addtocart.png");
        JButton cartButton7 = createCartButton(item7Label);
        cartButton7.setIcon(plusicon8);
        cartButton7.setContentAreaFilled(false);
        cartButton7.setBorder(BorderFactory.createEmptyBorder());
        cartButton7.setBounds(978, 238, 152, 24);
        userpanel.add(cartButton7);

        //MEnu8
        l8.setBounds(1213,76,100,120);
        userpanel.add(l8);
        JLabel item8Label = new JLabel("Soup $200");
        item8Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item8Label.setBounds(1206, 215, 120, 23);
        item8Label.setForeground(Color.BLACK);
        userpanel.add(item8Label);

        ImageIcon plusicon9 =new ImageIcon("images\\addtocart.png");
        JButton cartButton8 = createCartButton(item8Label);
        cartButton8.setIcon(plusicon9);
        cartButton8.setContentAreaFilled(false);
        cartButton8.setBorder(BorderFactory.createEmptyBorder());
        cartButton8.setBounds(1187, 238, 152, 24);
        userpanel.add(cartButton8);

        //MEnu9
        l9.setBounds(1004,305,100,120);
        userpanel.add(l9);
        JLabel item9Label = new JLabel("Momo $200");
        item9Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        item9Label.setBounds(994, 445, 130, 23);
        item9Label.setForeground(Color.BLACK);
        userpanel.add(item9Label);

        ImageIcon plusicon10 =new ImageIcon("images\\addtocart.png");
        JButton cartButton9 = createCartButton(item9Label);
        cartButton9.setIcon(plusicon10);
        cartButton9.setContentAreaFilled(false);
        cartButton9.setBorder(BorderFactory.createEmptyBorder());
        cartButton9.setBounds(978, 470, 152, 24);
        userpanel.add(cartButton9);


        //MEnu10
        l10.setBounds(1213,305,100,120);
        userpanel.add(l10);
        JLabel ap1Label = new JLabel("Coke $280");
        ap1Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        ap1Label.setBounds(1198, 445, 115, 23);
        ap1Label.setForeground(Color.BLACK);
        userpanel.add(ap1Label);

        ImageIcon plusPlusicon1=new ImageIcon("images\\addtocart.png");
        JButton cartBtn1 = createCartButton(ap1Label);
        cartBtn1.setIcon(plusPlusicon1);
        cartBtn1.setContentAreaFilled(false);
        cartBtn1.setBorder(BorderFactory.createEmptyBorder());
        cartBtn1.setBounds( 1187, 470, 152, 24);
        userpanel.add(cartBtn1);

        //MEnu11
        l11.setBounds(1005,547,100,120);
        userpanel.add(l11);
        JLabel ap2Label = new JLabel("MilkShake $220");
        ap2Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        ap2Label.setBounds(984, 667, 160, 24);
        ap2Label.setForeground(Color.BLACK);
        userpanel.add(ap2Label);

        ImageIcon plusPlusicon2=new ImageIcon("images\\addtocart.png");
        JButton cartBtn2 = createCartButton(ap2Label);
        cartBtn2.setIcon(plusPlusicon2);
        cartBtn2.setContentAreaFilled(false);
        cartBtn2.setBorder(BorderFactory.createEmptyBorder());
        cartBtn2.setBounds(977, 690, 152, 24);
        userpanel.add(cartBtn2);

        //MEnu12
        l12.setBounds(1213,547,100,120);
        userpanel.add(l12);
        JLabel ap3Label = new JLabel("Water $20");
        ap3Label.setFont(new Font("Roboto", Font.PLAIN, 18));
        ap3Label.setBounds(1206, 667, 130, 24);
        ap3Label.setForeground(Color.BLACK);
        userpanel.add(ap3Label);

        ImageIcon plusPlusicon3 =new ImageIcon("images\\addtocart.png");
        JButton cartBtn3 = createCartButton(ap3Label);
        cartBtn3.setIcon(plusPlusicon3);
        cartBtn3.setContentAreaFilled(false);
        cartBtn3.setBorder(BorderFactory.createEmptyBorder());
        cartBtn3.setBounds(1187, 690, 152, 24);
        userpanel.add(cartBtn3);




        // Remove from Cart Button
        JButton removeFromCartButton = new JButton("REMOVE");
        removeFromCartButton.setFocusable(false);
        removeFromCartButton.addActionListener(this);
        removeFromCartButton.setBounds(675, 690, 170, 35);
        removeFromCartButton.setBackground(Color.BLACK);
        removeFromCartButton.setForeground(Color.WHITE);

        removeFromCartButton.setFont(new Font("Roboto", Font.BOLD, 20));
        userpanel.add(removeFromCartButton);
        removeFromCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = cartList.getSelectedValue();
                if (selectedItem != null) {
                    cartListModel.removeElement(selectedItem);
                    totalAmount -= extractPrice(selectedItem);
                    totalPriceLabel.setText("Total Price: $" + totalAmount);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please select an item from the cart to remove.");
                }
            }
        });
        // ScrollPane for Cart
        JScrollPane cartScrollPane = new JScrollPane(cartList);
        cartScrollPane.setBackground(new Color(0, 0, 0, 0));
        cartScrollPane.setBounds(415, 88, 523, 591);
        userpanel.add(cartScrollPane);

        // Process Payment Button
        JButton paymentButton = new JButton("ORDER");
        paymentButton.setFocusable(false);
        paymentButton.addActionListener(this);
        paymentButton.setBounds(490, 690, 170, 35);
        paymentButton.setBackground(Color.BLACK);
        paymentButton.setForeground(Color.WHITE);
        paymentButton.setFont(new Font("Roboto", Font.BOLD, 20));
        userpanel.add(paymentButton);

        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartListModel.clear();
              //  totalAmount = 0.0;
              //  totalPriceLabel.setText("Total Price: $0.0");
                if (e.getSource() == paymentButton) {
                    dispose();
                    double currentTotalAmount = getTotalAmount();
                    // Get the latest totalAmount
                    Payment payment = new Payment(currentTotalAmount);
                    payment.setVisible(true);
                    codpayment wwd = new codpayment(currentTotalAmount);
                    bkashpayment wswd = new bkashpayment(currentTotalAmount);

                }
            }
        });
        payment_goback = new JButton("Goback");
        payment_goback.setBounds(1242 ,28,95,32);
        payment_goback.setFocusable(false);
        payment_goback.setBackground(Color.WHITE);
        payment_goback.setForeground(new Color(128,130,130));
        payment_goback.addActionListener(this);
        userpanel.add(payment_goback);


        // Total Price Label
        totalPriceLabel = new JLabel("Total Price: $0.0");
        totalPriceLabel.setBounds(664, 531, 300, 22);
        totalPriceLabel.setForeground(Color.WHITE);
        totalPriceLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        userpanel.add(totalPriceLabel);


        // BACKGROUND IMAGE
        customericon2 = new ImageIcon("images\\bgg.jpg");
        customerbg = new JLabel(customericon2);
        customerbg.setBounds(0, 0, 1366, 768);
        userpanel.add(customerbg);

        this.add(userpanel);

    }

    private JButton createCartButton(JLabel menuItemLabel) {
        JButton cartButton = new JButton("Cart");
        cartButton.setBounds(220, menuItemLabel.getY(), 60, 20);
        cartButton.addActionListener(new CartButtonActionListener(menuItemLabel));
        return cartButton;
    }

    public class CartButtonActionListener implements ActionListener {
        private JLabel menuItemLabel;

        public CartButtonActionListener(JLabel menuItemLabel) {
            this.menuItemLabel = menuItemLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedItem = menuItemLabel.getText();
            String quantityString = JOptionPane.showInputDialog(null, "Enter quantity for " + selectedItem);
            if (quantityString != null && !quantityString.isEmpty()) {
                try {
                    int quantity = Integer.parseInt(quantityString);

                    double itemPrice = extractPrice(selectedItem);
                    double totalPrice = itemPrice * quantity;
                    cartListModel.addElement(selectedItem + " x"+quantity +"  Price: "+ "$" + totalPrice);
                    totalAmount += totalPrice;
                    totalPriceLabel.setText("Total Price: $" + totalAmount);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.");
                }

            }
  }}

    public double getTotalAmount() {
        return totalAmount;
    }






    private double extractPrice(String item) {
        String priceString = item.substring(item.lastIndexOf("$") + 1);
        return Double.parseDouble(priceString);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userlgout) {
            dispose();
            login m = new login(us);
            m.setVisible(true);
        }

        if (e.getSource() == payment_goback) {
            dispose();
            customerPanel db = new customerPanel(u,us);
            db.setVisible(true);
        }
    }


    }


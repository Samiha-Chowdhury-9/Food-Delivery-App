package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class order_history_page extends JFrame implements ActionListener {

    JPanel order_history_panel;
    JButton orderhistory_goback;
    JLabel order_histry;
    double store;
    JTextArea orderHistoryTextArea;

    public order_history_page() {
        setTitle("Order History ");
        setSize(1366, 768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        order_history_panel = new JPanel(new BorderLayout());


        this.store = store;

        // Create JTextArea and add to the center of the BorderLayout
        orderHistoryTextArea = new JTextArea();
        orderHistoryTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderHistoryTextArea);
        order_history_panel.add(scrollPane, BorderLayout.CENTER);

        loadOrderHistory();



        // Create and add the "Order History" label to the north of the BorderLayout
        order_histry = new JLabel("Order History");
        order_histry.setFont(new Font("Raleway", Font.PLAIN, 32));
        order_history_panel.add(order_histry, BorderLayout.PAGE_START);

        add(order_history_panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == orderhistory_goback) {
            dispose();
            admindashboard wwd = new admindashboard();
            wwd.setVisible(true);
        }
    }

    private void loadOrderHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Files/order_history.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                orderHistoryTextArea.append(line + "\n");
                orderHistoryTextArea.setFont(new Font("Raleway",Font.PLAIN,20));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

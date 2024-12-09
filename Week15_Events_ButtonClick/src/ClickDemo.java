import javax.swing.*;

public class ClickDemo {

    public static void main(String[] args) {
    	// Create the frame (window)
        JFrame frame = new JFrame("Event Handling Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton button1 = new JButton("Greet");
        button1.setBounds(50, 80, 100, 30);

        JButton button2 = new JButton("Exit");
        button2.setBounds(200, 80, 100, 30);

        // Add ActionListener to buttons
        MyButtonClickListener handler = new MyButtonClickListener(frame);
        button1.addActionListener(handler);
        button2.addActionListener(handler);

        // Add buttons to the frame
        frame.setLayout(null);
        frame.add(button1);
        frame.add(button2);

        // Make the frame visible
        frame.setVisible(true);
    }
}

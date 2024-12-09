import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickDemoWithAnonymousclass {

	public static void main(String[] args) {
		// Create the frame (window)
		JFrame frame = new JFrame("Example Window");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a button
		JButton button = new JButton("Click Me!");
		button.setBounds(150, 80, 100, 30);

		// Add an ActionListener to the button
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Term almost done!");
			}
		});

		// Add the button to the frame
		frame.setLayout(null); // Using null layout for simplicity
		frame.add(button);

		// Make the frame visible
		frame.setVisible(true);

	}

}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonClickListener implements ActionListener {
	private JFrame frame;

	public MyButtonClickListener(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * Uncomment the below block and comment out all the rest
		 * of this method to merely show a message when the button
		 * is clicked.
		 * 
        // Show a dialog when the button is clicked
        JOptionPane.showMessageDialog(frame, "Term almost done!");
        
        */

		// Check the source of the event
		Object source = e.getSource();
		
		/**
		 * The source could be a number of things. We are checking
		 * that it is a button click.
		 * */
		if (source instanceof JButton) {
			// Now that we know we are dealing with a button,
			// cast into a variable of that type.
			JButton clickedButton = (JButton) source;

			// Perform actions based on the button's text
			if (clickedButton.getText().equals("Greet")) {
				JOptionPane.showMessageDialog(frame, "Hello, world!");
			
			} else if (clickedButton.getText().equals("Exit")) {
				/**
				 * We could do a else statement here rather than an else-if since
				 * we only have two buttons, but I would say that being more explicit
				 * here is better.
				 */
				
				JOptionPane.showMessageDialog(frame, "Have a great break!");
				/**
				 * Exit the application.
				 * Exiting with an exit code of 0, which means "success".
				 * Nonzero exit codes are used to represent an error. You
				 * can use other nonzero integers to interpret how you like,
				 * but 1 is used as the general error code for issues.
				 * 
				 */
				System.exit(0);
			}
		}
	}
}

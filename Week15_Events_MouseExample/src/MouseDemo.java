import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mouse Event Example");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Click anywhere!");
		label.setBounds(50, 50, 300, 30);

		/*
		 * Adding the mouse listener. This is what will track the mouse
		 * clicks events. 
		 */
		frame.addMouseListener(new MyMouseListener(label));

		frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);

	}

}

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseDemoWithAnonymousClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mouse Event Anonymous Class");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Click anywhere!");
		label.setBounds(50, 50, 300, 30);

		frame.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);

	}

}

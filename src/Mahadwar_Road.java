import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Mahadwar_Road extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mahadwar_Road frame = new Mahadwar_Road();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mahadwar_Road() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mahadwar road");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel_1.setBounds(237, 302, 174, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Chappal Galli");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setBounds(237, 358, 174, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\street-shopping-in-india-cover.jpg"));
		lblNewLabel_2.setBounds(0, 0, 600, 400);
		contentPane.add(lblNewLabel_2);
	}

}

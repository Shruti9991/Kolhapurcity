import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Mahalaxmi_Temple_info extends JFrame {

	private JPanel contentPane;
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mahalaxmi_Temple_info frame = new Mahalaxmi_Temple_info();
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
	public Mahalaxmi_Temple_info() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mahalakshmi Temple, Kolhapur");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 29, 373, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mahalakshmi Temple is also known as Ambabai Temple. ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1.setBounds(73, 76, 552, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The image of Mahalakshmi is carved in black stone with 3 feet. It was in ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 110, 615, 30);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1831 by Dhakji Dadaji..");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 150, 615, 30);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 212, 212, 37);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mahadwar Road, Kolhapur, Maharashtra - 416012");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_5.setBounds(73, 273, 427, 30);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Mahalakshmi final 2.jpg"));
		lblNewLabel_6.setBounds(0, 0, 600, 449);
		getContentPane().add(lblNewLabel_6);
		getContentPane().setLayout(null);
		
		
	}
}

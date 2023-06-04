import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Panhala_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panhala_Page frame = new Panhala_Page();
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
	public Panhala_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panhala Fort, Kolhapur");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 29, 259, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Panhala fort is the largest fort in the Deccan with ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1.setBounds(107, 76, 503, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("perimeter of 14 km and 110 lookout posts. It is built  between 1178-");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 104, 600, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1209. It is build by Bhoja II, Imbrahim Adil Shah.");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 140, 600, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address: ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 263, 259, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Panhala, Kolhapur, Maharshtra - 416201");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_5.setBounds(90, 295, 503, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Panhala 2.jpg"));
		lblNewLabel_6.setBounds(0, 0, 600, 399);
		contentPane.add(lblNewLabel_6);
	}

}

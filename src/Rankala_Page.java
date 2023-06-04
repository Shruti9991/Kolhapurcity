import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Rankala_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rankala_Page frame = new Rankala_Page();
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
	public Rankala_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rankala Lake, Kolhapur");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 27, 253, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rankala Lake is in westrn side of Ambabai temple. It is");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1.setBounds(89, 75, 463, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("a popular evening spot. This lake was constructed by late ");
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 106, 542, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Maharaj Shri Shahu Chhatrapati. ");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 138, 559, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel_4.setBounds(71, 191, 209, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hari Om Nagar, Kolhapur, Maharashtra - 416012");
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_5.setBounds(89, 246, 463, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\1rankala-0-1595254406.jpg"));
		lblNewLabel_6.setBounds(0, 0, 600, 315);
		contentPane.add(lblNewLabel_6);
	}

}

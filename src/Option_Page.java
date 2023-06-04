import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Option_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option_Page frame = new Option_Page();
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
	public Option_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Famous Places");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mahalaxmi_Temple mt=new Mahalaxmi_Temple();
				mt.show();
			}
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnNewButton.setBounds(118, 45, 257, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Mahalaxmi-temple-kolhapur (2).jpg"));
		lblNewLabel.setBounds(0, 0, 500, 135);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Famous Food");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Food_page fp=new Food_page();
				fp.show();
			}
		});
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnNewButton_1.setBounds(118, 179, 257, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Food.jpg"));
		lblNewLabel_1.setBounds(0, 135, 500, 135);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Shopping Places");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mahadwar_Road mr=new Mahadwar_Road();
				mr.show();
			}
		});
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnNewButton_2.setBounds(118, 321, 257, 42);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Kolhapuri Chappal.jpg"));
		lblNewLabel_2.setBounds(0, 270, 500, 135);
		contentPane.add(lblNewLabel_2);
	}
}

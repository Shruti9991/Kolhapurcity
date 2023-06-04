import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mahalaxmi_Temple extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mahalaxmi_Temple frame = new Mahalaxmi_Temple();
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
	public Mahalaxmi_Temple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Mahalaxmi Temple");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mahalaxmi_Temple_info mpf=new Mahalaxmi_Temple_info();
				mpf.show();
			}
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnNewButton.setBounds(156, 61, 235, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rankala Lake");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rankala_Page rp=new Rankala_Page();
				rp.show();
			}
		});
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnNewButton_1.setBounds(156, 150, 235, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Panhala Fort");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panhala_Page pp=new Panhala_Page();
				pp.show();
			}
		});
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnNewButton_2.setBounds(156, 246, 235, 41);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Palace (1).jpg"));
		lblNewLabel.setBounds(0, 0, 570, 379);
		contentPane.add(lblNewLabel);
	}

}

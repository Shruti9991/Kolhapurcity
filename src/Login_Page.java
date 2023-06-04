
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login_Page extends JFrame implements ActionListener {

	
	private JPanel contentPane;
	private JTextField txt_un;
	private JPasswordField pf;
	ResultSet rs;
	Connection con;
	Statement stmt;
	   
	String un,pw,tun,tpf;
	private JPanel contentPane1;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
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
	public Login_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(172, 172, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_un = new JTextField("Username");
		txt_un.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txt_un.setBounds(136, 126, 223, 26);
		contentPane.add(txt_un);
		txt_un.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(136, 235, 223, 30);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(136, 275, 223, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login To Your Account");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(136, 63, 202, 30);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 10));
		chckbxNewCheckBox.setBounds(136, 196, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		pf = new JPasswordField("Password");
		pf.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		pf.setBounds(136, 162, 223, 26);
		contentPane.add(pf);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\rankala-lake.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 350);
		contentPane.add(lblNewLabel_1);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			stmt=con.createStatement();
		}catch(Exception e1) {
			System.out.println(e1);
		}
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			String cmd=ae.getActionCommand();
			if(cmd.equals("Clear"))
			{
				txt_un.setText("");
				pf.setText("");
			}
			if(cmd.equals("Submit"))
			{
				 tun=txt_un.getText();
				    tpf=pf.getText();
					
				rs=stmt.executeQuery("select * from login");
				if(rs.next())
				{
					un=rs.getString("Username");
					pw=rs.getString("Password");
				   if((un.equals(tun))&&(pw.equals(tpf)))
					{
						Welcome_Page wp=new Welcome_Page();
						wp.show();
					}
				
				else
					JOptionPane.showMessageDialog(null, "Incorrect Username");
			}
			}
		}catch(Exception e2) {
			System.out.println(e2);
		}
	}
}
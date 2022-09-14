import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;



public class LoginPageStudentRes implements ActionListener{
	private JFrame LoginFrame;
	JButton loginButton =  new JButton("Login");
	JButton resButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userJPasswordField = new JPasswordField();
	JLabel userIDJLabel = new JLabel("Username");
	JLabel userPassrdJLabel = new JLabel("Password");
	JLabel messageLabel = new JLabel();
	 
	 
	
	HashMap<String, String> logininfoHashMap = new HashMap<String, String>();
	private JTextField textField;
	private JTextField textField_1;
	public LoginPageStudentRes(HashMap<String,String> loginInForOriginal) {
		LoginPageStudentRes();
		logininfoHashMap = loginInForOriginal;
		
		
	}
	
	
	public void LoginPageStudentRes(){
		LoginFrame = new JFrame();
		LoginFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rizvi\\Documents\\e325407ddc4e253ebbb41544104bdf6a.jpg"));
		LoginFrame.setVisible(true);
		LoginFrame.setTitle("Login");
		LoginFrame.getContentPane().setForeground(new Color(120, 120, 255));
		LoginFrame.getContentPane().setFont(new Font("Bell MT", Font.BOLD, 23));
		LoginFrame.getContentPane().setLayout(null);
		
				
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 500, 420);
		LoginFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon icon2 = new  ImageIcon("C:\\Users\\Rizvi\\Downloads\\password.png");
		Image image1 = icon2.getImage(); 
		Image newimg1 = image1.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg1);  // transform it back
		
		ImageIcon icon = new  ImageIcon("C:\\Users\\Rizvi\\Downloads\\user.png");
		Image image = icon.getImage(); 
		Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);  // transform it back
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(81, 36, 51, 108);
		lblNewLabel_1.setIcon(icon);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel();
		lblNewLabel_1_2.setBounds(81, 99, 51, 108);
		lblNewLabel_1_2.setIcon(icon2);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setBounds(125, 80, 232, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setBounds(81, 86, 51, 108);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(125, 142, 232, 27);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(195, 206, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset\r\n");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(195, 248, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Abbas");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rizvi\\Documents\\e325407ddc4e253ebbb41544104bdf6a.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 382);
		panel.add(lblNewLabel);
		LoginFrame.setBounds(50, 50, 500, 420);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}

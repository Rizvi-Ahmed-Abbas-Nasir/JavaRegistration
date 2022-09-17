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
import com.mysql.cj.x.protobuf.MysqlxSession.Reset;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;



public class LoginPageStudentRes implements ActionListener{
	private JFrame LoginFrame;
	JButton Login = new JButton("Login");
	JButton resButton = new JButton("Reset");
	JPasswordField userJPasswordField = new JPasswordField();
	JLabel userIDJLabel = new JLabel("Username");
	JLabel userPassrdJLabel = new JLabel("Password");
	JLabel messageLabel = new JLabel();
	private JTextField textField;
	private JTextField textField_1;
	JButton ResetButton = new JButton("Reset\r\n");
	 
	 
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	 LoginPageStudentRes(HashMap<String,String> loginInForOriginal){
		
		logininfo = loginInForOriginal;
		
		
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
		
		
		userJPasswordField.setForeground(Color.BLACK);;
		userJPasswordField.setColumns(10);
		userJPasswordField.setBackground(Color.WHITE);
		userJPasswordField.setBounds(125,142,232,27);
		panel.add(userJPasswordField);
		
		
		Login.setBackground(Color.WHITE);
		Login.setBounds(195, 206, 89, 23);
		Login.addActionListener(this);
		panel.add(Login);
		

		ResetButton.setBackground(Color.WHITE);
		ResetButton.setBounds(195, 248, 89, 23);
		ResetButton.addActionListener(this);
		panel.add(ResetButton);
		
		
		
		LoginFrame.setBounds(50, 50, 500, 420);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		messageLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		
		
		messageLabel.setBounds(172, 299, 158, 23);
		panel.add(messageLabel);
		
		JLabel lblNewLabel = new JLabel("Abbas");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rizvi\\Documents\\e325407ddc4e253ebbb41544104bdf6a.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 382);
		panel.add(lblNewLabel);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ResetButton) {
			textField.setText("");
			userJPasswordField.setText("");
			
		}
		if(e.getSource()==Login) {
			String userID = textField.getText();
			String password = String.valueOf(userJPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("This Is Working");
					LoginFrame.dispose();
					student_res student_res = new student_res();
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Wrong Password");
			}
			
		}
		else {
			messageLabel.setForeground(Color.green);
			messageLabel.setText("Username Not Found");
		}
		
	}
}

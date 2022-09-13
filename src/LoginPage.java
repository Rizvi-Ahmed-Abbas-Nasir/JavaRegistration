import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;



public class LoginPage implements ActionListener{
	private JFrame LoginFrame;
	JButton loginButton =  new JButton("Login");
	JButton resButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userJPasswordField = new JPasswordField();
	JLabel userIDJLabel = new JLabel("Username");
	JLabel userPassrdJLabel = new JLabel("Password");
	JLabel messageLabel = new JLabel();
	
	HashMap<String, String> logininfoHashMap = new HashMap<String, String>();
	public LoginPage(HashMap<String,String> loginInForOriginal) {
		Login();
		logininfoHashMap = loginInForOriginal;
		
		
	}
	
	
	public void Login(){
		LoginFrame = new JFrame();
		LoginFrame.setVisible(true);
		LoginFrame.setTitle("Login");
		LoginFrame.getContentPane().setForeground(new Color(120, 120, 255));
		LoginFrame.getContentPane().setFont(new Font("Bell MT", Font.BOLD, 23));
		LoginFrame.setBounds(50, 50, 500, 550);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginFrame.getContentPane().setLayout(null);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}

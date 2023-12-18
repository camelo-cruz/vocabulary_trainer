package vokabelTrainer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Choice;

public class loginMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginMenu frame = new loginMenu();
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
	public loginMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginBtn.setBounds(232, 160, 117, 29);
		contentPane.add(loginBtn);
		
		JButton registerBtn = new JButton("register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerBtn.setBounds(103, 160, 117, 29);
		contentPane.add(registerBtn);
		
		nameField = new JTextField();
		nameField.setBounds(161, 54, 204, 26);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel userLabel = new JLabel("User name");
		userLabel.setBounds(55, 59, 71, 16);
		contentPane.add(userLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(55, 97, 61, 16);
		contentPane.add(passwordLabel);
		
		JButton noRegistrationBtn = new JButton("Continue without registration");
		noRegistrationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		noRegistrationBtn.setBounds(103, 201, 246, 29);
		contentPane.add(noRegistrationBtn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 92, 204, 26);
		contentPane.add(passwordField);
	}
}

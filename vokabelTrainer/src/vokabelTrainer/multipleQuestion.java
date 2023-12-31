package vokabelTrainer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class multipleQuestion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					multipleQuestion frame = new multipleQuestion();
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
	public multipleQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox option1 = new JCheckBox("option_1");
		option1.setBounds(77, 148, 128, 23);
		contentPane.add(option1);
		
		JCheckBox option2 = new JCheckBox("option_2");
		option2.setBounds(77, 183, 128, 23);
		contentPane.add(option2);
		
		JCheckBox option3 = new JCheckBox("option_3");
		option3.setBounds(265, 148, 128, 23);
		contentPane.add(option3);
		
		JCheckBox option4 = new JCheckBox("option_3");
		option4.setBounds(265, 183, 128, 23);
		contentPane.add(option4);
		
		JButton checkButton = new JButton("Check!");
		checkButton.setBounds(173, 218, 117, 29);
		contentPane.add(checkButton);
		
		JLabel lblNewLabel = new JLabel("What is the correct translation?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(126, 75, 209, 16);
		contentPane.add(lblNewLabel);
		
		JLabel targetWord = new JLabel("Word");
		targetWord.setHorizontalAlignment(SwingConstants.CENTER);
		targetWord.setBounds(207, 114, 41, 16);
		contentPane.add(targetWord);
		
		JButton btnNewButton = new JButton("main menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(327, 6, 117, 29);
		contentPane.add(btnNewButton);
	}
}

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
		
		JCheckBox option1 = new JCheckBox("New check box");
		option1.setBounds(77, 104, 128, 23);
		contentPane.add(option1);
		
		JCheckBox option2 = new JCheckBox("New check box");
		option2.setBounds(77, 149, 128, 23);
		contentPane.add(option2);
		
		JCheckBox option3 = new JCheckBox("New check box");
		option3.setBounds(265, 104, 128, 23);
		contentPane.add(option3);
		
		JCheckBox option4 = new JCheckBox("New check box");
		option4.setBounds(265, 149, 128, 23);
		contentPane.add(option4);
		
		JButton checkButton = new JButton("Check!");
		checkButton.setBounds(174, 203, 117, 29);
		contentPane.add(checkButton);
		
		JLabel lblNewLabel = new JLabel("What is the correct translation?");
		lblNewLabel.setBounds(138, 21, 209, 16);
		contentPane.add(lblNewLabel);
		
		JLabel targetWord = new JLabel("Word");
		targetWord.setBounds(220, 64, 41, 16);
		contentPane.add(targetWord);
	}
}

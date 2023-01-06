package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton sendLogin = new JButton("New button");
		sendLogin.setBounds(288, 204, 89, 23);
		contentPane.add(sendLogin);
		
		textField = new JTextField();
		textField.setBounds(24, 28, 205, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 112, 205, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel matricolaVariableLogin = new JLabel("Matricola");
		matricolaVariableLogin.setBounds(24, 11, 46, 14);
		contentPane.add(matricolaVariableLogin);
		
		JLabel passwordVariableLogin = new JLabel("Password");
		passwordVariableLogin.setBounds(24, 92, 46, 14);
		contentPane.add(passwordVariableLogin);
	}
}

package formprin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOG extends JFrame {

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
					LOG frame = new LOG();
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
	public LOG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MARVEL VS DC");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 65));
		lblNewLabel_2.setBounds(119, 32, 396, 66);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().equals("1234") && textField_1.getText().equals("1234")) {
					new form_1().setVisible(true);
					dispose();
				}else {
					textField.setText("");
					textField_1.setText("");
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 14));
		btnNewButton.setBounds(292, 310, 101, 40);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(247, 218, 195, 20);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(247, 158, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Impact", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(33, 202, 195, 50);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("# USER:");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 40));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(98, 144, 139, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LOG.class.getResource("/formprin/marvelvsdc.jpg")));
		lblNewLabel.setBounds(0, -19, 630, 392);
		contentPane.add(lblNewLabel);
	}

}

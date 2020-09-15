package formprin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class form_1 extends JFrame {

	protected static final JTextArea txtS = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form_1 frame = new form_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public form_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 523, 10);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("*** SUPERHEROES ***");
		lblNewLabel.setBounds(100, 26, 309, 50);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		
		JButton btnmostrar = new JButton("DC");
		btnmostrar.setIcon(new ImageIcon(form_1.class.getResource("/formprin/dc.png")));
		btnmostrar.addMouseListener(new MouseAdapter() {

		});
		btnmostrar.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				class2 nw = new class2();
				nw.NewScreen();
				dispose(); 
				
			}
		});
		btnmostrar.setBounds(22, 165, 196, 147);
		contentPane.add(btnmostrar);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				class3 nw = new class3();
				nw.NewScreenn();
				dispose();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(form_1.class.getResource("/formprin/marvel2.png")));
		btnNewButton_1.setBounds(297, 165, 207, 147);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("CLICK EN LA IMAGEN PARA MAS INFO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(165, 323, 196, 14);
		contentPane.add(lblNewLabel_1);
		
		
	}
}

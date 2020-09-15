package formprin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class class2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class2 window = new class2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public class2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 676, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPERMAN");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 0, 131, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UN SUPERHEROE QUE LLEG\u00D3 DE OTRO PLANETA,SU NOMBRE");
		lblNewLabel_1.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 34, 323, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BATMAN");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(115, 223, 104, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("UN MULTIMILLONARIO QUE COMBATE AL CRIMEN");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(0, 259, 278, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(class2.class.getResource("/formprin/batman.gif")));
		lblNewLabel_4.setBounds(117, 354, 102, 91);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(class2.class.getResource("/formprin/superman.jpg")));
		lblNewLabel_5.setBounds(117, 121, 102, 91);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" Y LA INJUSTICIA, VIVE EN CIUDAD G\u00D3TICA SU NOMBRE");
		lblNewLabel_6.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setBounds(10, 290, 294, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("ES BRUCE WAYNE");
		lblNewLabel_7.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(20, 314, 104, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(" EN SU PLANETA ES KAL-EL PERO EN LA TIERRA LO CONOCEN ");
		lblNewLabel_8.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(10, 62, 315, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("COMO CLARK KENT");
		lblNewLabel_9.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(20, 87, 131, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		Button button = new Button("");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.DARK_GRAY);
		button.setEnabled(false);
		button.setBounds(345, 10, 18, 424);
		frame.getContentPane().add(button);
		
		JLabel lblLinternaVerde = new JLabel("LINTERNA VERDE");
		lblLinternaVerde.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinternaVerde.setForeground(Color.RED);
		lblLinternaVerde.setFont(new Font("Impact", Font.ITALIC, 22));
		lblLinternaVerde.setBounds(447, 10, 155, 35);
		frame.getContentPane().add(lblLinternaVerde);
		
		JLabel lblNewLabel_2_1 = new JLabel("WONDER WOMEN");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_1.setBounds(447, 234, 170, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_10 = new JLabel("ES UNO DE LOS COMICS MAS DENSO EN LO QUE ");
		lblNewLabel_10.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setBounds(369, 43, 281, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("COMPRENDE  MITOLOG\u00CDA, ESTE HEROE SE LLAMA ");
		lblNewLabel_11.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_11.setBounds(369, 64, 269, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("HALL JORDAN.");
		lblNewLabel_12.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_12.setBounds(379, 89, 86, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(class2.class.getResource("/formprin/GREENLANTERN.jpg")));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_13.setBounds(420, 121, 170, 91);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(class2.class.getResource("/formprin/WONDERWOMEN.png")));
		lblNewLabel_14.setBounds(475, 341, 100, 100);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("CONOCIDA COMO LA PRINCESA DIANA DE TEMISCIRA");
		lblNewLabel_15.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_15.setBounds(369, 264, 291, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("UNA GUERRERA DEL AMAZONAS (PUEBLO FICTICIO)");
		lblNewLabel_16.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_16.setBounds(379, 292, 271, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("PERSONAJE CREADO EN 1942");
		lblNewLabel_17.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_17.setBounds(389, 316, 185, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		JButton btnNewButton = new JButton("->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				class21 nw = new class21();
				nw.NewScreenn1();
				frame.setVisible(false);
			}
			
		});
		btnNewButton.setBounds(585, 440, 58, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new form_1().setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(18, 440, 75, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}

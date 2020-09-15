package formprin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class class3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreenn() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class3 window = new class3();
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
	public class3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 51, 51));
		frame.setBounds(100, 100, 742, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button button = new Button("");
		button.setForeground(Color.DARK_GRAY);
		button.setEnabled(false);
		button.setBackground(Color.BLACK);
		button.setBounds(352, 22, 18, 440);
		frame.getContentPane().add(button);
		
		JLabel lblIronMan = new JLabel("IRON MAN");
		lblIronMan.setHorizontalAlignment(SwingConstants.CENTER);
		lblIronMan.setForeground(new Color(255, 255, 255));
		lblIronMan.setFont(new Font("Impact", Font.ITALIC, 22));
		lblIronMan.setBounds(103, 17, 131, 35);
		frame.getContentPane().add(lblIronMan);
		
		JLabel lblNewLabel_2 = new JLabel("CAPITAN AM\u00C9RICA");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(74, 245, 172, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("HULK");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_1.setBounds(466, 22, 172, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("SPIDERMAN");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_2.setBounds(466, 245, 172, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(class3.class.getResource("/formprin/IRONMAN.gif")));
		lblNewLabel.setBounds(109, 134, 100, 100);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EL MULTIMILLONARIO Y GENIO CONOCIDO COMO TONY STARK ");
		lblNewLabel_1.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 62, 328, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ES UNO DE LOS PERSONAJES MAS INFLUYENTE DE LA ");
		lblNewLabel_1_1.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(40, 87, 275, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("FRANQUICIA MARVEL Y QUE USA UNA ARMADURA COMPLETA");
		lblNewLabel_1_2.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_2.setBounds(10, 109, 328, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("EL SOLDADO QUE DURMIO 70 A\u00D1OS DORMIDO EN EL HIELO Y QUE");
		lblNewLabel_1_3.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_3.setBounds(6, 281, 352, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SALV\u00D3 A MUCHOS SOLDADOS INCLUYENDO SU NACI\u00D3N, ");
		lblNewLabel_1_4.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_4.setBounds(27, 306, 335, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("CONOCIDO COMO STEVE ROGERS");
		lblNewLabel_1_5.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_5.setBounds(83, 331, 279, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("BRUCE BANNER ERA UN CIENTIFICO APASIONADO QUE POR");
		lblNewLabel_1_6.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_6.setBounds(376, 62, 327, 14);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("UN ACCIDENTE CON DESECHOS TOXICOS EL TOMO UNA");
		lblNewLabel_1_7.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_7.setBounds(386, 87, 300, 14);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_9 = new JLabel("PETER PARKER ES UN ESTUDIANTE DE SECUNDARIA EN QUEENS ");
		lblNewLabel_1_9.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_9.setBounds(376, 281, 337, 14);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("UN D\u00CDA UNA ARA\u00D1A LE PIC\u00D3 Y TODOS SUS SENTIDOS CAMBIARON");
		lblNewLabel_1_10.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_10.setBounds(376, 308, 350, 14);
		frame.getContentPane().add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(class3.class.getResource("/formprin/captain-america.jpg")));
		lblNewLabel_3.setBounds(127, 356, 107, 106);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_9_1 = new JLabel("NUEVA APRIENCIA AL ENOJARSE....");
		lblNewLabel_1_9_1.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_1_9_1.setBounds(431, 109, 187, 14);
		frame.getContentPane().add(lblNewLabel_1_9_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(class3.class.getResource("/formprin/hulk.gif")));
		lblNewLabel_4.setBounds(482, 122, 156, 126);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Y EL AHORA COMBATE EL CRIMEN EN SU CIUDAD.");
		lblNewLabel_5.setFont(new Font("Impact", Font.ITALIC, 14));
		lblNewLabel_5.setBounds(404, 333, 255, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(class3.class.getResource("/formprin/spiderman.jpg")));
		lblNewLabel_6.setBounds(504, 358, 134, 106);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				class31 nw = new class31();
				nw.NewScreen31();
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton.setBounds(656, 11, 60, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new form_1().setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(10, 11, 67, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}

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

public class class31 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen31() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class31 window = new class31();
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
	public class31() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(178, 34, 34));
		frame.setBounds(100, 100, 831, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button button = new Button("");
		button.setForeground(Color.DARK_GRAY);
		button.setEnabled(false);
		button.setBackground(Color.BLACK);
		button.setBounds(277, 10, 4, 424);
		frame.getContentPane().add(button);
		
		JLabel lblBlackPanther = new JLabel("BLACK PANTHER");
		lblBlackPanther.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlackPanther.setForeground(new Color(240, 255, 240));
		lblBlackPanther.setFont(new Font("Impact", Font.ITALIC, 22));
		lblBlackPanther.setBounds(67, 22, 149, 35);
		frame.getContentPane().add(lblBlackPanther);
		
		JLabel lblNewLabel_2 = new JLabel("BLACK WIDOW");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(240, 255, 240));
		lblNewLabel_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(79, 255, 137, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblAntMan = new JLabel("ANT MAN");
		lblAntMan.setHorizontalAlignment(SwingConstants.CENTER);
		lblAntMan.setForeground(new Color(240, 255, 240));
		lblAntMan.setFont(new Font("Impact", Font.ITALIC, 22));
		lblAntMan.setBounds(338, 22, 131, 35);
		frame.getContentPane().add(lblAntMan);
		
		JLabel lblNewLabel_2_1 = new JLabel("THANOS");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_2_1.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_1.setBounds(365, 255, 114, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		Button button_1 = new Button("");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setEnabled(false);
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(558, 10, 4, 424);
		frame.getContentPane().add(button_1);
		
		JLabel lblThor = new JLabel("THOR");
		lblThor.setHorizontalAlignment(SwingConstants.CENTER);
		lblThor.setForeground(new Color(240, 255, 240));
		lblThor.setFont(new Font("Impact", Font.ITALIC, 22));
		lblThor.setBounds(606, 22, 131, 35);
		frame.getContentPane().add(lblThor);
		
		JLabel lblNewLabel_2_2 = new JLabel("DR STRANGE");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(240, 255, 240));
		lblNewLabel_2_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_2.setBounds(606, 245, 149, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("PROVENIENTE DE WAKANDA, EST\u00C1 EL REY T-CHALA\r\n");
		lblNewLabel.setBounds(10, 56, 261, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("QUIEN LLEVA EL MANTO PARA PROTEGER SU TIERRA.");
		lblNewLabel_1.setBounds(10, 92, 271, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NATASHA ROMANOFF. DESDE NI\u00D1A LA ENTRENARON");
		lblNewLabel_3.setBounds(10, 292, 261, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PARA SER UNA AGENTE SECRETA EN MISIONES.");
		lblNewLabel_4.setBounds(10, 322, 249, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SCOTT LANG, UN LADRON PROFESIONAL QUE DE");
		lblNewLabel_5.setBounds(301, 61, 244, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PRONTO SU VIDA CAMBIARIA CUANDO OBTENDRIA");
		lblNewLabel_6.setBounds(301, 92, 261, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("EL TRAJE DE ANTMAN...");
		lblNewLabel_7.setBounds(299, 117, 118, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("EL TITAN QUE QUIERE EQUILIBRAR CADA PLANETA");
		lblNewLabel_8.setBounds(301, 297, 261, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("AL QUE INVADE....");
		lblNewLabel_9.setBounds(301, 322, 131, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("EL ASGARDIANO HIJO DEL REY ODIN Y MIEMBRO");
		lblNewLabel_10.setBounds(568, 61, 247, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("ACTUAL DE LOS VENGADORES.");
		lblNewLabel_11.setBounds(568, 92, 158, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("EL BRILLANTE DOCTOR QUE POR UN ACCIDENTE");
		lblNewLabel_12.setBounds(570, 281, 245, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("TRAS LA CURA ESPIRITUAL Y APRENDI\u00D3 COSAS");
		lblNewLabel_13.setBounds(569, 306, 246, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("FUERA DE LA REALIDAD...");
		lblNewLabel_14.setBounds(568, 333, 137, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(class31.class.getResource("/formprin/blackpanther.jpg")));
		lblNewLabel_15.setBounds(102, 117, 114, 107);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("");
		lblNewLabel_15_1.setIcon(new ImageIcon(class31.class.getResource("/formprin/blackwidow.jpg")));
		lblNewLabel_15_1.setBounds(102, 346, 114, 107);
		frame.getContentPane().add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_15_2 = new JLabel("");
		lblNewLabel_15_2.setIcon(new ImageIcon(class31.class.getResource("/formprin/antman.jpg")));
		lblNewLabel_15_2.setBounds(379, 142, 100, 107);
		frame.getContentPane().add(lblNewLabel_15_2);
		
		JLabel lblNewLabel_15_3 = new JLabel("");
		lblNewLabel_15_3.setIcon(new ImageIcon(class31.class.getResource("/formprin/thanos.jpg")));
		lblNewLabel_15_3.setBounds(379, 346, 100, 107);
		frame.getContentPane().add(lblNewLabel_15_3);
		
		JLabel lblNewLabel_15_4 = new JLabel("");
		lblNewLabel_15_4.setIcon(new ImageIcon(class31.class.getResource("/formprin/thor.jpg")));
		lblNewLabel_15_4.setBounds(637, 117, 100, 107);
		frame.getContentPane().add(lblNewLabel_15_4);
		
		JLabel lblNewLabel_15_5 = new JLabel("");
		lblNewLabel_15_5.setIcon(new ImageIcon(class31.class.getResource("/formprin/dr strange.jpg")));
		lblNewLabel_15_5.setBounds(637, 346, 100, 107);
		frame.getContentPane().add(lblNewLabel_15_5);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				class3 nw = new class3();
				nw.NewScreenn();
				frame.setVisible(false);
			
				
			}
		});
		btnNewButton.setBounds(10, 10, 45, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new form_1().setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(734, 10, 71, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}

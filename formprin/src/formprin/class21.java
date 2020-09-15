package formprin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class class21 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreenn1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class21 window = new class21();
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
	public class21() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCyborg = new JLabel("SuperBoy");
		lblCyborg.setHorizontalAlignment(SwingConstants.CENTER);
		lblCyborg.setForeground(Color.RED);
		lblCyborg.setFont(new Font("Impact", Font.ITALIC, 22));
		lblCyborg.setBounds(61, 10, 131, 35);
		frame.getContentPane().add(lblCyborg);
		
		JLabel lblNewLabel_2 = new JLabel("FireStorm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(88, 255, 104, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPowergirl = new JLabel("PowerGirl");
		lblPowergirl.setHorizontalAlignment(SwingConstants.CENTER);
		lblPowergirl.setForeground(Color.RED);
		lblPowergirl.setFont(new Font("Impact", Font.ITALIC, 22));
		lblPowergirl.setBounds(334, 10, 131, 35);
		frame.getContentPane().add(lblPowergirl);
		
		JLabel lblNewLabel_2_1 = new JLabel("JONAH HEX");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_1.setBounds(351, 255, 114, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblAquaman = new JLabel("AQUAMAN");
		lblAquaman.setHorizontalAlignment(SwingConstants.CENTER);
		lblAquaman.setForeground(Color.RED);
		lblAquaman.setFont(new Font("Impact", Font.ITALIC, 22));
		lblAquaman.setBounds(592, 22, 131, 35);
		frame.getContentPane().add(lblAquaman);
		
		JLabel lblNewLabel_2_2 = new JLabel("BOOSTER GOLD");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setFont(new Font("Impact", Font.ITALIC, 22));
		lblNewLabel_2_2.setBounds(595, 245, 140, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("Jon Kent, Hijo de Superman y Lois Lane");
		lblNewLabel.setFont(new Font("Impact", Font.ITALIC, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 56, 246, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSusPadresDescubrieron = new JLabel("Sus padres descubrieron su poder desde ni\u00F1o....");
		lblSusPadresDescubrieron.setFont(new Font("Impact", Font.ITALIC, 13));
		lblSusPadresDescubrieron.setHorizontalAlignment(SwingConstants.CENTER);
		lblSusPadresDescubrieron.setBounds(10, 81, 267, 14);
		frame.getContentPane().add(lblSusPadresDescubrieron);
		
		JLabel lblEstFormadoPor = new JLabel("Est\u00E1 formado por Ronnie Raymond y Martin Stein");
		lblEstFormadoPor.setFont(new Font("Impact", Font.ITALIC, 12));
		lblEstFormadoPor.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstFormadoPor.setBounds(10, 281, 256, 14);
		frame.getContentPane().add(lblEstFormadoPor);
		
		JLabel lblDeUnAccidente = new JLabel("de un accidente nuclear se unen para ser FIRESTORM ");
		lblDeUnAccidente.setFont(new Font("Impact", Font.ITALIC, 12));
		lblDeUnAccidente.setBounds(10, 305, 267, 14);
		frame.getContentPane().add(lblDeUnAccidente);
		
		JLabel lblEsLaVersin = new JLabel("Es la versi\u00F3n alternativa de  Super Girl, a ella");
		lblEsLaVersin.setFont(new Font("Impact", Font.ITALIC, 12));
		lblEsLaVersin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsLaVersin.setBounds(313, 57, 228, 14);
		frame.getContentPane().add(lblEsLaVersin);
		
		JLabel lblSoloLeAfecta = new JLabel("solo le afecta la Kryptonita de la Tierra-2.");
		lblSoloLeAfecta.setFont(new Font("Impact", Font.ITALIC, 12));
		lblSoloLeAfecta.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoloLeAfecta.setBounds(313, 82, 204, 14);
		frame.getContentPane().add(lblSoloLeAfecta);
		
		JLabel lblSuNombreHumano = new JLabel("Su nombre humano es Arthur Curry muy ");
		lblSuNombreHumano.setFont(new Font("Impact", Font.ITALIC, 12));
		lblSuNombreHumano.setBounds(561, 68, 206, 14);
		frame.getContentPane().add(lblSuNombreHumano);
		
		JLabel lblNormalPeroEn = new JLabel("normal pero en atlantis es un Rey.");
		lblNormalPeroEn.setFont(new Font("Impact", Font.ITALIC, 12));
		lblNormalPeroEn.setBounds(578, 93, 165, 14);
		frame.getContentPane().add(lblNormalPeroEn);
		
		JLabel lblUnVaqueroDel = new JLabel("Un vaquero del Oeste Americano con una");
		lblUnVaqueroDel.setFont(new Font("Impact", Font.ITALIC, 12));
		lblUnVaqueroDel.setBounds(303, 281, 214, 14);
		frame.getContentPane().add(lblUnVaqueroDel);
		
		JLabel lblCicatrizEnEl = new JLabel("cicatriz en la cara debido a sus batallas campales.");
		lblCicatrizEnEl.setFont(new Font("Impact", Font.ITALIC, 12));
		lblCicatrizEnEl.setBounds(296, 305, 245, 14);
		frame.getContentPane().add(lblCicatrizEnEl);
		
		JLabel lblUnJugadorDe = new JLabel("Un jugador de Futbol Americano del futuro");
		lblUnJugadorDe.setFont(new Font("Impact", Font.ITALIC, 12));
		lblUnJugadorDe.setBounds(561, 281, 216, 14);
		frame.getContentPane().add(lblUnJugadorDe);
		
		JLabel lblQueAlPonerse = new JLabel("que al ponerse un anillo obtenia superpoderes");
		lblQueAlPonerse.setFont(new Font("Impact", Font.ITALIC, 12));
		lblQueAlPonerse.setBounds(561, 305, 223, 14);
		frame.getContentPane().add(lblQueAlPonerse);
		
		Button button = new Button("");
		button.setForeground(Color.DARK_GRAY);
		button.setEnabled(false);
		button.setBackground(Color.BLACK);
		button.setBounds(272, 10, 18, 424);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setEnabled(false);
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(537, 10, 18, 424);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setIcon(new ImageIcon(class21.class.getResource("/formprin/superboy.png")));
		lblNewLabel_1.setBounds(61, 112, 168, 138);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(class21.class.getResource("/formprin/firestorm.jpg")));
		lblNewLabel_1_1.setBounds(88, 330, 104, 104);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setIcon(new ImageIcon(class21.class.getResource("/formprin/power-girl-01.jpg")));
		lblNewLabel_1_2.setBounds(324, 107, 165, 143);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setIcon(new ImageIcon(class21.class.getResource("/formprin/jonah hexxx.jpeg")));
		lblNewLabel_1_3.setBounds(358, 330, 131, 117);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon(class21.class.getResource("/formprin/aquaman.jpg")));
		lblNewLabel_1_4.setBounds(613, 118, 110, 105);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon(class21.class.getResource("/formprin/booster gold.jpg")));
		lblNewLabel_1_5.setBounds(617, 341, 118, 93);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				class2 nw = new class2();
				nw.NewScreen();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 424, 59, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new form_1().setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(719, 424, 75, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 810, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

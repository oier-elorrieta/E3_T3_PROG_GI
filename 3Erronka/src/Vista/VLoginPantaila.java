package Vista;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DatuBasea.BezeroDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import Modelo.Bezeroa;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class VLoginPantaila extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txt_erabiltzailea;
	private JTextField txt_pass;

	/**
	 * Login klasearen konstruktorea. Interfaze grafikoa hasierako saioaren leihoa
	 * konfiguratzen du.
	 */
	public VLoginPantaila() {
		ImageIcon ikonoa = new ImageIcon("img/logo.jpg"); // Aldatu bidezko zure irudien bidea
		setIconImage(ikonoa.getImage());

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Etiketak eta testu eremuak
		JLabel lblErabiltzailea = new JLabel("Sartu erabiltzailea");
		lblErabiltzailea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblErabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblErabiltzailea.setBounds(10, 109, 336, 14);
		contentPane.add(lblErabiltzailea);

		JLabel lblPasahitza = new JLabel("Sartu pasahitza");
		lblPasahitza.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPasahitza.setBounds(10, 205, 336, 14);
		contentPane.add(lblPasahitza);

		txt_erabiltzailea = new JTextField();
		txt_erabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_erabiltzailea.setBounds(373, 108, 226, 20);
		contentPane.add(txt_erabiltzailea);
		txt_erabiltzailea.setColumns(10);

		// Saioa hasi botoia
		JButton btnLogin = new JButton("Saioa hasi");
		btnLogin.setBounds(10, 272, 764, 32);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erabiltzailea = txt_erabiltzailea.getText();
				String pasahitza = txt_pass.getText();
				if (loginaKonprobatu(erabiltzailea, pasahitza)) {
					// Saioa ondo hasi da, hurrengo pantailara joan

					JOptionPane.showMessageDialog(null, "Saioa hasi duzu.");

					dispose();

					// Hemen aplikazio nagusira joatea gehitu
				} else {
					// Saioa hasi ez da, errorea erakutsi
					JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza okerra.");
				}
			}
		});

		contentPane.add(btnLogin);

		// Titulu etiketa
		JLabel lblNewLabel_2 = new JLabel("Saio Hasiera");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 30, 764, 32);
		contentPane.add(lblNewLabel_2);

		txt_pass = new JTextField();
		txt_pass.setBounds(373, 204, 226, 20);
		contentPane.add(txt_pass);
		txt_pass.setColumns(10);
	}

	/**
	 * Saioaren sarreraren egiaztapena egiten duen metodoa.
	 * 
	 * @param erabiltzailea Sartutako erabiltzaile izena.
	 * @param pasahitza     Sartutako pasahitza.
	 * @return Egiaztapen egokia bada true, bestela false.
	 */
	public boolean loginaKonprobatu(String erabiltzailea, String pasahitza) {
		BezeroDAO bezeroDAO = new BezeroDAO();
		Bezeroa[] bezeroak = bezeroDAO.bezeroakJaso();
		for (Bezeroa bezero : bezeroak) {
			if (bezero != null && bezero.getErabiltzailea().equals(erabiltzailea)
					&& bezero.getPasahitza().equals(pasahitza)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 3 segundo bateko atzerapen sartzen duen metodoa.
	 */
	public void itxaron() {
		try {
			Thread.sleep(3 * 1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
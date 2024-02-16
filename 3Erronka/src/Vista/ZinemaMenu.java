package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Zinema;
import Modelo.DatuBasea.ZinemaDAO;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ZinemaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ZinemaDAO zinem = new ZinemaDAO();
	private Zinema[] zinemak = new Zinema[4];

	public ZinemaMenu() {
		setTitle("Ventana con Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblTitulua = new JLabel("Aukeratu zinema!");
		lblTitulua.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblTitulua.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblTitulua, BorderLayout.NORTH);

		JPanel botoiPanela = new JPanel();
		contentPane.add(botoiPanela, BorderLayout.CENTER);
		botoiPanela.setLayout(new GridLayout(2, 2, 10, 10));

		// ----------- ARTEA -----------
		JButton btnYArtea = new JButton("");
		botoiPanela.add(btnYArtea);
		zinemak = zinem.zinemakJaso();
		if (zinemak.length > 0) {
			btnYArtea.setText(zinemak[3].getIzena());
		}
		btnYArtea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// ----------- ELORRIETA -----------
		JButton btnEZinema = new JButton("");

		botoiPanela.add(btnEZinema);
		zinemak = zinem.zinemakJaso();
		if (zinemak.length > 0) {
			btnEZinema.setText(zinemak[0].getIzena());
		}
		btnEZinema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botoiPanela.add(btnEZinema);

		// ----------- CINESA -----------

		JButton btnCMaxCenter = new JButton("");

		botoiPanela.add(btnCMaxCenter);
		zinemak = zinem.zinemakJaso();
		if (zinemak.length > 0) {
			btnCMaxCenter.setText(zinemak[2].getIzena());
		}
		btnCMaxCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botoiPanela.add(btnCMaxCenter);

		// ----------- MEGA PARK -----------

		JButton btnYMegaPark = new JButton("");

		botoiPanela.add(btnYMegaPark);
		zinemak = zinem.zinemakJaso();
		if (zinemak.length > 0) {
			btnYMegaPark.setText(zinemak[1].getIzena());
		}
		btnYMegaPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botoiPanela.add(btnYMegaPark);
	}

}

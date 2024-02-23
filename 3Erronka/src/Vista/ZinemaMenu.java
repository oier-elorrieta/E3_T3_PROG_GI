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

	public ZinemaMenu(Zinema[] zinemak) {

		setTitle("Ventana con Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
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

		// ----------- ELORRIETA -----------
		JButton btnEZinema = new JButton(zinemak[0].getIzena());
		botoiPanela.add(btnEZinema);

		btnEZinema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            MenuaFilma frame = new MenuaFilma(zinemak, 0);
		            frame.setVisible(true);
		        } catch (Exception e1) {
		            e1.printStackTrace();
		        }
			}
		});
		botoiPanela.add(btnEZinema);


		// ----------- MEGA PARK -----------
		JButton btnMegaPark = new JButton(zinemak[1].getIzena());

		botoiPanela.add(btnMegaPark);

		btnMegaPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            MenuaFilma frame = new MenuaFilma(zinemak, 1); 
		            frame.setVisible(true);
		        } catch (Exception e1) {
		            e1.printStackTrace();
		        }
			}
		});
		botoiPanela.add(btnMegaPark);

		// ----------- CINESA -----------

		JButton btnCMaxCenter = new JButton(zinemak[2].getIzena());

		botoiPanela.add(btnCMaxCenter);

		btnCMaxCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            MenuaFilma frame = new MenuaFilma(zinemak, 2); 
		            frame.setVisible(true);
		        } catch (Exception e1) {
		            e1.printStackTrace();
		        }
			}
		});
		botoiPanela.add(btnCMaxCenter);

		// ----------- ARTEA -----------

		JButton btnYArtea = new JButton(zinemak[3].getIzena());
		botoiPanela.add(btnYArtea);

		btnYArtea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            MenuaFilma frame = new MenuaFilma(zinemak, 3);
		            frame.setVisible(true);
		        } catch (Exception e1) {
		            e1.printStackTrace();
		        }
			}
		});
		botoiPanela.add(btnYArtea);
	}

}

package Vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Modelo.Saioa;
import Modelo.Zinema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class VOrduaAukeraketa extends JFrame {

	private JPanel contentPane;
	public String autatutakoGeneroa = "";
	private Zinema[] zinemak;
	private int zineIndex;

	public VOrduaAukeraketa(Zinema[] zinemak, int zineIndex, String zinemaIzena, String aukPelikula, String aukData) {
		this.zinemak = zinemak;
		this.zineIndex = zineIndex;

		ImageIcon icono = new ImageIcon("img/logo.jpg");
		setIconImage(icono.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblOrduaAuk = new JLabel("Aukeratu nahi duzun ordua");
		lblOrduaAuk.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrduaAuk.setFont(new Font("Times New Roman", Font.BOLD, 48));
		contentPane.add(lblOrduaAuk, BorderLayout.NORTH);

		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_2, BorderLayout.CENTER);

		Saioa[] saioak = zinemak[zineIndex].getSaioak();
		TreeSet<Saioa> horasSet = new TreeSet<>(new Comparator<Saioa>() {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

			public int compare(Saioa s1, Saioa s2) {
				try {
					Date hora1 = sdf.parse(s1.getOrdutegia().toString());
					Date hora2 = sdf.parse(s2.getOrdutegia().toString());
					return hora1.compareTo(hora2);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return 0;
			}
		});

		Collections.addAll(horasSet, saioak);

		JPanel panelBotoiak = new JPanel(); // Sortu botoientzako panela hemen
		splitPane_2.setLeftComponent(panelBotoiak); // Gehitu panelBotoiak splitPane_2ra

		JPanel panel = new JPanel();
		splitPane_2.setRightComponent(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblLaburpenZine = new JLabel("Aukeratutako zinema = " + zinemaIzena);
		lblLaburpenZine.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaburpenZine.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblLaburpenZine);

		JLabel lblLaburpenPeli = new JLabel("Aukeratutako pelikula = " + aukPelikula);
		lblLaburpenPeli.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaburpenPeli.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblLaburpenPeli);

		JLabel lblLaburpenData = new JLabel("Aukeratutako data = " + aukData);
		lblLaburpenData.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaburpenData.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblLaburpenData);

		for (Saioa saioa : horasSet) {
			JButton btnOrdu = new JButton(saioa.getOrdutegia().toString());
			panelBotoiak.add(btnOrdu); // Gehitu botoia panelBotoiak-era

			btnOrdu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String orduaAuk = btnOrdu.getText();
					dispose();
					try {

						VErosketa erosketara = new VErosketa(zinemak, zineIndex, zinemaIzena, aukPelikula, aukData,
								orduaAuk);
						erosketara.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
		}

		JButton btnAtzeraJoan = new JButton("Atzera");
		btnAtzeraJoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VEgunaAukeraketa dataMenu = new VEgunaAukeraketa(zinemak, zineIndex, zinemaIzena, aukPelikula);
				dataMenu.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnAtzeraJoan, BorderLayout.SOUTH);
	}
}
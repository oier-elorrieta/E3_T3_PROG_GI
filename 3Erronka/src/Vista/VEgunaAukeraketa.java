package Vista;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Modelo.Zinema;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VEgunaAukeraketa extends JFrame {

	public VEgunaAukeraketa(Zinema[] zinemak, int zineIndex, String zinemaIzena, String aukPelikula) {
		SortuDataAukerlea(zinemak, zineIndex, zinemaIzena, aukPelikula);
	}

	private void SortuDataAukerlea(Zinema[] zinemak, int zineIndex, String zinemaIzena, String aukPelikula) {
		// Dataren modeloa konfiguratu
		UtilDateModel model = new UtilDateModel();
		Properties properties = new Properties();
		properties.put("text.today", "Gaur");
		properties.put("text.month", "Hilabetea");
		properties.put("text.year", "Urtea");

		// Pasatutako egunetako datarik atzera ez uzteko modeloa konfiguratu
		model.setSelected(true); // Data gaurkoa hautatu

		// Data aukeratzeko panela sortu
		JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);

		// Data aukeratzailea sortu DateComponentFormatter erabiliz
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

		// Data aukeratzailea konfiguratu
		datePicker.getJFormattedTextField().setEditable(true);

		// Modeloari PropertyChangeListener bat gehitu datak balidatzeko
		model.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				Date selectedDate = model.getValue();
				Date currentDate = new Date();
				if (selectedDate != null && selectedDate.before(currentDate)) {
					// Data minimoan berreskuratu
					model.setValue(currentDate); // Hautatutako data gaurkoa izan behar da
				}
			}
		});

		// Frame-a sortu eta konfiguratu
		setTitle("JDatePicker-en Adibidea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(418, 278);
		getContentPane().setLayout(new FlowLayout());

		JLabel lbldataHautaketa = new JLabel("Hautatu Data");
		lbldataHautaketa.setFont(new Font("Tahoma", Font.PLAIN, 36));
		getContentPane().add(lbldataHautaketa);
		getContentPane().add(datePicker);

		JSplitPane splitPane_1 = new JSplitPane();
		getContentPane().add(splitPane_1);

		JButton btnAurreraJoan = new JButton("Aurrera");
		btnAurreraJoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Hautatutako data lortu
				String aukData = (int) datePicker.getModel().getYear() + "-"
						+ ((int) datePicker.getModel().getMonth() + 1) + "-" + (int) datePicker.getModel().getDay();

				// OrduaAukeratu eraikitzeko hautatutako data pasatu
				VOrduaAukeraketa orduaAukera = new VOrduaAukeraketa(zinemak, zineIndex, zinemaIzena, aukPelikula,
						aukData);
				orduaAukera.setVisible(true);

				dispose();
			}
		});
		splitPane_1.setRightComponent(btnAurreraJoan);
		btnAurreraJoan.setVerticalAlignment(SwingConstants.BOTTOM);

		JButton btnAtzeraJoan = new JButton("Atzera");
		btnAtzeraJoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VFilmaAukeraketa menuFilm = new VFilmaAukeraketa(zinemak, zineIndex, zinemaIzena);
				menuFilm.setVisible(true);
				dispose();
			}
		});
		splitPane_1.setLeftComponent(btnAtzeraJoan);
		btnAtzeraJoan.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAtzeraJoan.setHorizontalAlignment(SwingConstants.LEFT);
	}
}

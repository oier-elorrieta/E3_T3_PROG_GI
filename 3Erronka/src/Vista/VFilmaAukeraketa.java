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

public class VFilmaAukeraketa extends JFrame {

    private JPanel contentPane;
    public String autatutakoGeneroa = "";


    public VFilmaAukeraketa(Zinema[] zinemak, int zineIndex, String zinemaIzena) {
        // Leihoaren konfigurazioa
        ImageIcon ikonoa = new ImageIcon("img/logo.jpg");
        setIconImage(ikonoa.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Goiburuko konfigurazioa
        JLabel lblNewLabel_3 = new JLabel("Aukeratu nahi duzun pelikula");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 48));
        contentPane.add(lblNewLabel_3, BorderLayout.NORTH);

        JSplitPane splitPane_2 = new JSplitPane();
        splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
        contentPane.add(splitPane_2, BorderLayout.CENTER);

        JLabel lblSartuNahiDuzun = new JLabel("pelikulak:");
        splitPane_2.setLeftComponent(lblSartuNahiDuzun);
        lblSartuNahiDuzun.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JPanel panel_1 = new JPanel();
        splitPane_2.setRightComponent(panel_1);
        panel_1.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btnAtzera = new JButton("ATZERA");
        btnAtzera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VZinemaAukeraketa menuZinema = new VZinemaAukeraketa(zinemak, 0);
            	menuZinema.setVisible(true);
                dispose();
            }
        });
        contentPane.add(btnAtzera, BorderLayout.SOUTH);

        Saioa[] saioak = zinemak[zineIndex].getSaioak();
        for (int i = 0; i < zinemak.length; i++) {
            JButton btnFilm = new JButton(saioak[i].getPelikula().getIzena());
            panel_1.add(btnFilm);

            // Botoi baten klik egitean ekintza
            btnFilm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	dispose();
                	String aukPelikula = btnFilm.getText();
                    VEgunaAukeraketa DataAukeratu = new VEgunaAukeraketa(zinemak, zineIndex, zinemaIzena, aukPelikula);
                    DataAukeratu.setVisible(true);
                }
            });
        }
    }
}

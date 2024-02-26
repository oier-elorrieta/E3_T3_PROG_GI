package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Zinema;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VErosketa extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;



/**
* Sortu pantaila.
*/
public VErosketa(Zinema[] zinemak, int zineIndex, String zinemaIzena, String aukPelikula, String aukData, String orduaAuk) {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1388, 443);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(new BorderLayout(0, 0));

JLabel lblTituloErosketa = new JLabel("ZURE HAUTAKETAK:");
lblTituloErosketa.setHorizontalAlignment(SwingConstants.CENTER);
lblTituloErosketa.setFont(new Font("Stencil", Font.PLAIN, 20));
contentPane.add(lblTituloErosketa, BorderLayout.NORTH);

JPanel panel = new JPanel();
contentPane.add(panel, BorderLayout.SOUTH);

JSplitPane splitPane = new JSplitPane();
panel.add(splitPane);

JButton btnAtzera = new JButton("Atzera");
btnAtzera.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

VOrduaAukeraketa dataMenu = new VOrduaAukeraketa(zinemak, zineIndex, zinemaIzena, aukPelikula, aukData);
        dataMenu.setVisible(true);
        dispose();
}
});
splitPane.setLeftComponent(btnAtzera);

JButton btnErosi = new JButton("Erosketa");
btnErosi.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
VLoginPantaila login = new VLoginPantaila();
login.setVisible(true);
        dispose();
}
});
splitPane.setRightComponent(btnErosi);
     
     JSplitPane splitPane_1 = new JSplitPane();
     splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
     contentPane.add(splitPane_1, BorderLayout.CENTER);
     
     JPanel panel_1 = new JPanel();
     splitPane_1.setLeftComponent(panel_1);
     
     JPanel panel_2 = new JPanel();
     splitPane_1.setRightComponent(panel_2);
     panel_2.setLayout(new GridLayout(1, 0, 0, 0));
     
     JLabel lblLaburpenZine = new JLabel("Aukeratutako zinema = " + zinemaIzena );
     panel_2.add(lblLaburpenZine);
     lblLaburpenZine.setHorizontalAlignment(SwingConstants.CENTER);
     lblLaburpenZine.setFont(new Font("Tahoma", Font.PLAIN, 17));
     
     JLabel lblLaburpenPeli = new JLabel("Aukeratutako pelikula = " + aukPelikula );
     panel_2.add(lblLaburpenPeli);
     lblLaburpenPeli.setHorizontalAlignment(SwingConstants.CENTER);
     lblLaburpenPeli.setFont(new Font("Tahoma", Font.PLAIN, 17));
     
           JLabel lblLaburpenData = new JLabel("Aukeratutako data = " + aukData );
           panel_2.add(lblLaburpenData);
           lblLaburpenData.setHorizontalAlignment(SwingConstants.CENTER);
           lblLaburpenData.setFont(new Font("Tahoma", Font.PLAIN, 17));
           
           JLabel lblOrdu = new JLabel("Aukeratutako Ordua = " + orduaAuk);
           panel_2.add(lblOrdu);

}

}
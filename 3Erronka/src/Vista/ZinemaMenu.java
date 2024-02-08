package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;

public class ZinemaMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

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
        
        
        JButton btnYArtea = new JButton("Yelmo Artea");
        botoiPanela.add(btnYArtea);
        
        JButton btnEZinema = new JButton("Elorrieta Zinema");
        botoiPanela.add(btnEZinema);
        
        JButton btnCMaxCenter = new JButton("Cinesa MaxCenter");
        botoiPanela.add(btnCMaxCenter);
        
        JButton btnYMegaPark = new JButton("Yelmo MegaPark");
        botoiPanela.add(btnYMegaPark);
    }

}

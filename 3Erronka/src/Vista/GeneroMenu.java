package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class GeneroMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	GeneroMenu frame = new GeneroMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GeneroMenu() {
        setTitle("Selecciona un género");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 150);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lblTitulo = new JLabel("Selecciona un género:");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblTitulo);
        
        JComboBox<String> comboBoxGeneros = new JComboBox<String>();
        comboBoxGeneros.addItem("Drama");
        comboBoxGeneros.addItem("Miedo");
        comboBoxGeneros.addItem("Sci-Fi");
        contentPane.add(comboBoxGeneros);
    }

}

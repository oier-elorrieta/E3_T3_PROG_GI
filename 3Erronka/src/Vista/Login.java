package Vista;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * La clase `iniciarsesion` representa la ventana de inicio de sesión.
 * Extiende JFrame para crear la interfaz gráfica que permite a los usuarios iniciar sesión.
 */
public class Login extends JFrame {

    public static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JTextField txt_erabiltzailea;
    public JTextField txt_pass;

    /**
     * Constructor de la clase `iniciarsesion`.
     * Inicializa y configura la interfaz gráfica para la ventana de inicio de sesión.
     *
     * @param mDatuak La instancia del modelo de datos.
     */
    public Login() {
        ImageIcon icono = new ImageIcon("img/logo.jpg"); // Cambia la ruta por la de tu imagen
        setIconImage(icono.getImage());

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 580, 330);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Etiquetas y campos de texto
        JLabel lblNewLabel = new JLabel("Sartu erabiltzailea");
        lblNewLabel.setBounds(164, 108, 125, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Sartu pasahitza");
        lblNewLabel_1.setBounds(164, 164, 118, 14);
        contentPane.add(lblNewLabel_1);

        txt_erabiltzailea = new JTextField();
        txt_erabiltzailea.setBounds(306, 105, 118, 20);
        contentPane.add(txt_erabiltzailea);
        txt_erabiltzailea.setColumns(10);

        txt_pass = new JTextField();
        txt_pass.setBounds(306, 161, 118, 20);
        contentPane.add(txt_pass);
        txt_pass.setColumns(10);

        // Botón de inicio de sesión
        JButton btnLogin = new JButton("Sesioa hasi");
       
        btnLogin.setBounds(221, 239, 118, 23);
        contentPane.add(btnLogin);

        // Etiqueta de título
        JLabel lblNewLabel_2 = new JLabel("Saio Hasiera");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel_2.setBounds(202, 11, 178, 32);
        contentPane.add(lblNewLabel_2);
    }

    /**
     * Método que introduce un retardo de 3 segundos.
     */
    public void itxaron() {
        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
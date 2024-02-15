package Vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import com.toedter.calendar.JCalendar;

/**
 * La clase MenuaG representa la interfaz gráfica para seleccionar un género de películas.
 * Extiende JFrame para crear la ventana principal.
 */
public class DataAukeratu extends JFrame {

    private JPanel contentPane; // Panel principal de la ventana
    public String autatutakoGeneroa = ""; // Variable para almacenar el género seleccionado

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Lógica para iniciar la aplicación
            }
        });
    }

    /**
     * Constructor de la clase MenuaG.
     * Inicializa y configura la interfaz gráfica para seleccionar un género de películas.
     */
    public DataAukeratu() {
        // Configuración de la ventana
        ImageIcon icono = new ImageIcon("img/logo.jpg"); // Cambia la ruta por la de tu imagen
        setIconImage(icono.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 507, 351);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Configuración del encabezado
        JLabel lblNewLabel_3 = new JLabel("Aukeratu data");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 32));
        contentPane.add(lblNewLabel_3, BorderLayout.NORTH);

        // Configuración del panel inferior
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);

        JSplitPane splitPane = new JSplitPane();
        panel.add(splitPane);

        // Botón para avanzar
        JButton btnGordeData = new JButton("Aurrera");
  
        splitPane.setRightComponent(btnGordeData);

        // Botón para retroceder
        JButton btnAtzera = new JButton("Atzera");
       
        splitPane.setLeftComponent(btnAtzera);
        
        JCalendar calendar = new JCalendar();
        contentPane.add(calendar, BorderLayout.CENTER);

        // Cargar imagen desde la carpeta "imagenes"
        String pathToImage = "img/imgGen.jpg"; // Ajusta la ruta de tu imagen
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
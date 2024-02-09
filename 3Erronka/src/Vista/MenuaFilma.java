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

/**
 * La clase MenuaG representa la interfaz gráfica para seleccionar un género de películas.
 * Extiende JFrame para crear la ventana principal.
 */
public class MenuaFilma extends JFrame {

    private JPanel contentPane; // Panel principal de la ventana
    public String autatutakoGeneroa = ""; // Variable para almacenar el género seleccionado
    public static JComboBox generoZerrenda; // Cuadro desplegable para la selección de género

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
    public MenuaFilma() {
        // Configuración de la ventana
        ImageIcon icono = new ImageIcon("img/logo.jpg"); // Cambia la ruta por la de tu imagen
        setIconImage(icono.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Configuración del encabezado
        JLabel lblNewLabel_3 = new JLabel("Aukeratu nahi duzun pelikula");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 48));
        contentPane.add(lblNewLabel_3, BorderLayout.NORTH);

        // Configuración del panel inferior
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);

        JSplitPane splitPane = new JSplitPane();
        panel.add(splitPane);

        // Botón para avanzar
        JButton btnGordeGeneroa = new JButton("Aurrera");
  
        splitPane.setRightComponent(btnGordeGeneroa);

        // Botón para retroceder
        JButton btnAtzera = new JButton("Atzera");
       
        splitPane.setLeftComponent(btnAtzera);

        JSplitPane splitPane_2 = new JSplitPane();
        splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
        contentPane.add(splitPane_2, BorderLayout.CENTER);

        JSplitPane splitPane_1 = new JSplitPane();
        splitPane_2.setLeftComponent(splitPane_1);

        // Etiqueta para indicar la selección de género
        JLabel lblSartuNahiDuzun = new JLabel("Sartu nahi duzun generoa:    ");
        lblSartuNahiDuzun.setFont(new Font("Tahoma", Font.PLAIN, 15));
        splitPane_1.setLeftComponent(lblSartuNahiDuzun);

        // Cuadro desplegable para la selección de género
        generoZerrenda = new JComboBox();
        generoZerrenda.setFont(new Font("Tahoma", Font.PLAIN, 15));
        /*generoZerrenda.setModel(new DefaultComboBoxModel;*/
        splitPane_1.setRightComponent(generoZerrenda);

        // Panel para mostrar la imagen
        JPanel pnlImagen = new JPanel();
        splitPane_2.setRightComponent(pnlImagen);

        // Cargar imagen desde la carpeta "imagenes"
        String pathToImage = "img/imgGen.jpg"; // Ajusta la ruta de tu imagen
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mostrar la imagen en un JLabel
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        pnlImagen.add(picLabel);
    }
}
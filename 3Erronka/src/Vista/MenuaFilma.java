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

/**
 * La clase MenuaG representa la interfaz gráfica para seleccionar un género de películas.
 * Extiende JFrame para crear la ventana principal.
 */
public class MenuaFilma extends JFrame {

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
     
            }
        });
    }

    /**
     * Constructor de la clase MenuaG.
     * Inicializa y configura la interfaz gráfica para seleccionar un género de películas.
     */
    public MenuaFilma(Zinema[] zinemak, int zineIndex) {
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

        JSplitPane splitPane_2 = new JSplitPane();
        splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
        contentPane.add(splitPane_2, BorderLayout.CENTER);

        // Cargar imagen desde la carpeta "imagenes"
        String pathToImage = "img/imgGen.jpg"; // Ajusta la ruta de tu imagen
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Etiqueta para indicar la selección de género
        JLabel lblSartuNahiDuzun = new JLabel("pelikulak:");
        splitPane_2.setLeftComponent(lblSartuNahiDuzun);
        lblSartuNahiDuzun.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JPanel panel_1 = new JPanel();
        splitPane_2.setRightComponent(panel_1);
        panel_1.setLayout(new GridLayout(1, 0, 0, 0));
        
        JButton btnAtzera = new JButton("ATZERA");
        btnAtzera.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        contentPane.add(btnAtzera, BorderLayout.SOUTH);
       
        Saioa[] saioak = zinemak[zineIndex].getSaioak(); 
        for (int i = 0; i < zinemak.length; i++) {
            JButton btnFilm1 = new JButton(saioak[i].getPelikula().getIzena()); 
            panel_1.add(btnFilm1);
        }

    }
}
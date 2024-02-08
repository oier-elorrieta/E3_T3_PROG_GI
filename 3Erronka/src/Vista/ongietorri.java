package Vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ongietorri extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JProgressBar progressBar;
    private JLabel lblKargatzen;
    private Timer tiempo; // Temporizador para actualizar la ProgressBar
    private boolean startProgress = false; // Variable para controlar el inicio de la ProgressBar

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ongietorri frame = new ongietorri();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ongietorri() {
        // Configuración de la ventana
        ImageIcon icono = new ImageIcon("img/logo.jpg");
        setIconImage(icono.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 620, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Configuración de la etiqueta de bienvenida
        JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");
        lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
        lblOngiEtorri.setFont(new Font("Arial", Font.BOLD, 40));
        contentPane.add(lblOngiEtorri, BorderLayout.NORTH);

        // Configuración del panel dividido para la ProgressBar y la imagen
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        contentPane.add(splitPane, BorderLayout.CENTER);

        JSplitPane splitPane_1 = new JSplitPane();
        splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setRightComponent(splitPane_1);

        // Configuración de la ProgressBar
        progressBar = new JProgressBar();
        splitPane_1.setLeftComponent(progressBar);

        // Configuración del panel para la imagen
        JPanel panelImagen = new JPanel();
        splitPane_1.setRightComponent(panelImagen);
        String pathToImage = "img/imgGen.jpg";
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mostrar la imagen en un JLabel
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panelImagen.add(picLabel);

        // Configuración de la etiqueta de carga
        lblKargatzen = new JLabel("kargatzen...");
        splitPane.setLeftComponent(lblKargatzen);
        lblKargatzen.setHorizontalAlignment(SwingConstants.CENTER);

        // Temporizador para actualizar la ProgressBar
        tiempo = new Timer(30, e -> updateProgressBar());
        tiempo.setRepeats(true);
        tiempo.setCoalesce(true);
        tiempo.setInitialDelay(0);

        // Agregar MouseListener a la imagen para iniciar/detener la ProgressBar
        picLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (startProgress) {
                    tiempo.stop(); // Detener la ProgressBar
                    startProgress = false;
                } else {
                    tiempo.start(); // Iniciar la ProgressBar
                    startProgress = true;
                }
            }
        });
    }

    private void updateProgressBar() {
        int value = progressBar.getValue();
        if (value < progressBar.getMaximum()) {
            progressBar.setValue(value + 1);
        } else {
            tiempo.stop(); // Detener el temporizador cuando se alcanza el máximo
        }
    }
}

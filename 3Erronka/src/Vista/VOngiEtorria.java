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

public class VOngiEtorria extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JProgressBar progressBar;
    private JLabel lblKargatzen;
    private Timer tiempo; // Progresu-barra eguneratzeko denbora-erraza
    private boolean startProgress = false; // Progresu-barra hasierakoa kontrolatzeko aldagaia

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	VOngiEtorria frame = new VOngiEtorria();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public VOngiEtorria() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 620, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");
        lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
        lblOngiEtorri.setFont(new Font("Arial", Font.BOLD, 40));
        contentPane.add(lblOngiEtorri, BorderLayout.NORTH);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        contentPane.add(splitPane, BorderLayout.CENTER);

        JSplitPane splitPane_1 = new JSplitPane();
        splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setRightComponent(splitPane_1);

        progressBar = new JProgressBar();
        splitPane_1.setLeftComponent(progressBar);

        JPanel panelImagen = new JPanel();
        splitPane_1.setRightComponent(panelImagen);
        String pathToImage = "img/imgGen.jpg";
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panelImagen.add(picLabel);

        lblKargatzen = new JLabel("kargatzen...");
        splitPane.setLeftComponent(lblKargatzen);
        lblKargatzen.setHorizontalAlignment(SwingConstants.CENTER);

        tiempo = new Timer(30, e -> updateProgressBar());
        tiempo.setRepeats(true);
        tiempo.setCoalesce(true);
        tiempo.setInitialDelay(0);

        panelImagen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!startProgress) {
                    startProgressBar(); // Progresu-barra hasieratzeko metodoaren deia
                }
            }
        });
    }

    // Progresu-barra hasieratzeko metodoa
    private void startProgressBar() {
        tiempo.start(); // Progresu-barra hasi
        startProgress = true;
    }

    // Progresu-barra eguneratzeko metodoa
    private void updateProgressBar() {
        int value = progressBar.getValue();
        if (value < progressBar.getMaximum()) {
            progressBar.setValue(value + 1);
        } else {
            tiempo.stop(); // Gehienezera iritsi denean denboragailua gelditu
            startProgress = false;
            // Uneko leihoa ezkutatu eta berrirako leihoa erakutsi
            setVisible(false);
        }
    }

    // Progresu-barra egoera lortzeko metodoa
    public boolean isStartProgress() {
        return startProgress;
    }
}

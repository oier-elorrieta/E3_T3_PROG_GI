package DatuBasea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

import Modelo.Aretoa;
import Modelo.Karteldegia;
import Modelo.Pelikula;
import Modelo.Saioa;

public class SaioaDAO {
    private Saioa[] saioak;
    private PelikulaDAO filmak = new PelikulaDAO();
    private Karteldegia karteldegi = new Karteldegia(filmak.pelikulakJaso());
    private int kont = 0;

    public Saioa[] saioakJaso(int id_zinema) {
        Konexioa konexioa = new Konexioa();
        Connection konektatu = konexioa.konektatu();

        if (konektatu != null) {
            try {
                String countQuery = "SELECT COUNT(*) AS count FROM saioa WHERE id_zinema = ?";
                PreparedStatement countStatement = konektatu.prepareStatement(countQuery);
                countStatement.setInt(1, id_zinema);
                ResultSet countResult = countStatement.executeQuery();
                countResult.next();
                int rowCount = countResult.getInt("count");
                saioak = new Saioa[rowCount]; // Set the array size based on the number of rows

                String sql = "SELECT * FROM saioa WHERE id_zinema = ?";
                PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
                preparedStatement.setInt(1, id_zinema);
                ResultSet lerroak = preparedStatement.executeQuery();

                while (lerroak.next()) {
                    int id_saioa = lerroak.getInt("id_saioa");
                    LocalTime ordutegia = lerroak.getTime("ordutegia").toLocalTime();
                    LocalDate saioEguna = lerroak.getDate("saioaren_eguna").toLocalDate();
                    int pelikula_id = lerroak.getInt("id_filma");
                    Pelikula pelikula = karteldegi.getPelikulaId(pelikula_id);
                    int aretoa_id = lerroak.getInt("id_aretoa");
                    AretoDAO aretoDAO = new AretoDAO();
                    Aretoa[] aretoak = aretoDAO.aretoakJaso(id_zinema);
                    Aretoa aretoa = aretoDAO.getAretoaId(aretoa_id, aretoak);

                    saioak[kont] = new Saioa(id_saioa, ordutegia, saioEguna, pelikula, aretoa);
                    kont++;
                }
            } catch (SQLException e) {
                System.err.println("Errorea: Ezin izan da kontsulta egin.");
                e.printStackTrace();
            } finally {
                konexioa.deskonektatu();
            }
        }
        return saioak;
    }
}

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
    private int id_saioa = 0;
    private LocalTime ordutegia;
    private LocalDate saioEguna;
    private int pelikula_id = 0;
    private  Pelikula pelikula = null;
    private int aretoa_id = 0;
    private Aretoa aretoa;
    
    public Saioa[] saioakJaso(int id_zinema) {
        Konexioa konexioa = new Konexioa();
        Connection konektatu = konexioa.konektatu();

        if (konektatu != null) {
            try {
                String sql = "SELECT * FROM saioa WHERE id_zinema = ?";
                PreparedStatement preparedStatement = konektatu.prepareStatement(sql);
                preparedStatement.setInt(1, id_zinema);
                ResultSet lerroak = preparedStatement.executeQuery();

                // Datuen errenkaden kopurua kontatu
                int zenbat = 0;
                while (lerroak.next()) {
                    zenbat++;
                }
                lerroak.beforeFirst(); // ResultSet-aren hasierara bueltatu

                // Errenkada kopurua erabiliz, arraya hasieratu
                saioak = new Saioa[zenbat];

                // ResultSet-era joan eta Saioa objektuak sortu
                while (lerroak.next()) {
                    id_saioa = lerroak.getInt("id_saioa");
                    ordutegia = lerroak.getTime("ordutegia").toLocalTime();
                    saioEguna = lerroak.getDate("saioaren_eguna").toLocalDate();
                    pelikula_id = lerroak.getInt("id_filma");
                    pelikula = karteldegi.getPelikulaId(pelikula_id);
                    aretoa_id = lerroak.getInt("id_aretoa");
                    AretoDAO aretoDAO = new AretoDAO();
                    Aretoa[] aretoak = aretoDAO.aretoakJaso(id_zinema);
                    aretoa = aretoDAO.getAretoaId(aretoa_id, aretoak);

                    saioak[kont] = new Saioa(id_saioa, ordutegia, saioEguna, pelikula, aretoa);
                    kont++;
                }
                return saioak;
            } catch (SQLException e) {
                System.err.println("Errorea: Ezin izan da kontsulta egin.");
                e.printStackTrace();
            } finally {
                konexioa.deskonektatu();
            }
        }
        return null;
    }

}

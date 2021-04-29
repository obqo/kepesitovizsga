package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class JurassicPark {

    private final DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select breed from dinosaur where expected < actual ORDER BY breed")) {
            return selectPopulationByPS(ps);
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed!", se);
        }
    }

    private List<String> selectPopulationByPS(PreparedStatement ps) {
        List<String> result = new LinkedList<>();
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(rs.getString("breed"));
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query!", se);
        }
    }

}

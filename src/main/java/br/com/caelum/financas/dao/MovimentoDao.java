package br.com.caelum.financas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.caelum.financas.model.Movimento;

@Repository
public class MovimentoDao {
    private final Connection connection;

    @Autowired
    public MovimentoDao(DataSource dataSource) {
        try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void adiciona(Movimento movimento) {
        String sql = "insert into movimento (ganho, fonte,tipo,valor) values (?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setBoolean(1, movimento.isGanho());
            // stmt.setDate(2, movimento.getData());

            stmt.setString(2, movimento.getFonte());
            stmt.setString(3, movimento.getTipo());
            stmt.setDouble(4, movimento.getValor());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Movimento> lista() {
        try {
            List<Movimento> movimentos = new ArrayList<Movimento>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from movimento");

            ResultSet rs = stmt.executeQuery();
            Movimento m;
            while (rs.next()) {
                m = new Movimento();
                m.setValor(rs.getDouble("valor"));
                movimentos.add(m);
            }

            rs.close();
            stmt.close();

            return movimentos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

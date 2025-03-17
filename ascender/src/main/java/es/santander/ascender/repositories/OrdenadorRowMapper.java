package es.santander.ascender.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import es.santander.ascender.negocio.Ordenador;

public class OrdenadorRowMapper implements RowMapper<Ordenador> {

    @Override
    public Ordenador mapRow(ResultSet rs, int rowNum) throws SQLException {
        //poner los rs en el mismo orden que han sido declarados en la clase orden 
        return new Ordenador(
                rs.getInt("nserie"),
                rs.getString("marca"),
                rs.getString("modelo"),
                rs.getDouble("precio"));
    }
}

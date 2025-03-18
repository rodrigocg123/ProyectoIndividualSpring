package es.santander.ascender.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.santander.ascender.negocio.Ordenador;

@Repository
@Qualifier("jdbc")
public class OrdenadorrepositoryJDBC implements Ordenadorrepository {

    @Autowired
    private JdbcTemplate plantilla;

    @Override
    public List<Ordenador> buscartodos() {
        return plantilla.query("select * from ordenador", new OrdenadorRowMapper());
    }

    @Override
    public List<Ordenador> seleccionar() {
        return plantilla.query("select *from ordenador", new OrdenadorRowMapper());
    }

    @Override
    public void insertar(Ordenador ordenador) {
        plantilla.update("insert into ordenador values (?,?,?,?)",
                ordenador.getNserie(),
                ordenador.getMarca(),
                ordenador.getModelo(),
                ordenador.getPrecio());

    }

    @Override
    public void borrar(int nserie) {
        plantilla.update("DELETE FROM ordenador WHERE nserie=?", nserie);
    }

    // borrar todos
    @Override
    public void borrartodos() {
        plantilla.update("delete from ordenador");
    }

    @Override
    public Ordenador buscarUno(int nserie) {
        return plantilla.queryForObject("select * from ordenador where nserie=?", new OrdenadorRowMapper(), nserie);
    }

}

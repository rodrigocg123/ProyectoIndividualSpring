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

    // @Override
    // public List<Ordenador> seleccionartodos() {
    //     return plantilla.query("select * from ordenador", new OrdenadorRowMapper());
    // }

    @Override
    public List<Ordenador> buscartodos() {
        return plantilla.query("select * from ordenador", new OrdenadorRowMapper());
    }

    @Override
    public Ordenador seleccionarUno(double nserie) {
        return plantilla.queryForObject("select * from ordenador where nserie=?",new OrdenadorRowMapper(),nserie);
    }

    @Override
    public void insertar(Ordenador ordenador) {
        plantilla.update("insert into ordenador values (?,?,?,?)",
                ordenador.getNserie(),
                ordenador.getMarca(),
                ordenador.getPrecio(),
                ordenador.getModelo());
    }

    @Override
    public void borrar(Ordenador ordenador) {
        plantilla.update("delete * from ordenador where nserie=?", ordenador.getNserie());
        
    }

    @Override
    public  List<Ordenador> borrartodos() {
        List<Ordenador> ordenadores;
        ordenadores = plantilla.query("SELECT * FROM ordenador", new OrdenadorRowMapper());
        String sqlDelete = "DELETE FROM ordenador";
        plantilla.update(sqlDelete);
        return ordenadores;
        
    }

}

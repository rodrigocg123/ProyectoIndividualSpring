package es.santander.ascender.repositories;

import java.util.List;

import es.santander.ascender.negocio.Ordenador;

public interface Ordenadorrepository {

    // List<Ordenador> seleccionartodos();
    List<Ordenador> buscartodos();

    Ordenador seleccionarUno(double nserie);

    void insertar(Ordenador ordenador);

    void borrar(Ordenador ordenador);

    List<Ordenador> borrartodos();

}

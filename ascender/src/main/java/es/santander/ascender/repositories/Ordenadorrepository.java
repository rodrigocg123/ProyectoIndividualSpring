package es.santander.ascender.repositories;

import java.util.List;

import es.santander.ascender.negocio.Ordenador;

public interface Ordenadorrepository {

    // List<Ordenador> seleccionartodos();
    List<Ordenador> buscartodos();

    List<Ordenador> seleccionar();

    void insertar(Ordenador ordenador);
    // funcion borrar uno
    void borrar(int nserie);

    //funcion borrar todos
    void borrartodos();

    Ordenador buscarUno(int nserie);
}

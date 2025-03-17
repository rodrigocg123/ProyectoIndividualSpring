package es.santander.ascender.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.santander.ascender.negocio.Ordenador;
import es.santander.ascender.repositories.Ordenadorrepository;

@RestController
@RequestMapping("/webapi/ordenador")
public class OrdenadorRestController {

    @Autowired
    @Qualifier("jdbc")
    private Ordenadorrepository ordenadorRepository;

    // FUNCION BUSCAR
    @GetMapping 
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Ordenador> buscartodos() {

        return ordenadorRepository.buscartodos();

    }

    // FUNCION INSERTAR
    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public void insertar(@RequestBody Ordenador ordenador) {
        ordenadorRepository.insertar(ordenador);
    }

    // FUNCIONES BORRAR
    @DeleteMapping("/numeroserie/{nserie}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void borrar(@PathVariable int nserie) {
        ordenadorRepository.borrar(nserie);
    }
    
    @GetMapping ("/webapi/ordenador")
    @CrossOrigin(origins = "http://localhost:4200")
    public Ordenador buscarUno(@PathVariable int nserie) {
        return ordenadorRepository.buscarUno(nserie);
    }
    //FUNCION SELECCIONAR
    @GetMapping ("/seleccionar/{nserie}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Ordenador> seleccionar(@PathVariable int nserie) {
        return ordenadorRepository.seleccionar();
    }
}

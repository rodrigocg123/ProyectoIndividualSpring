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

    // @GetMapping
    // @CrossOrigin(origins = "http://localhost:4200")
    // public List<Ordenador> seleccionartodos(){
    //         return ordenadorRepository.seleccionartodos();
        
    // }

    //FUNCION BUSCAR
    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Ordenador> buscartodos() {

        return ordenadorRepository.buscartodos();

    }

    //FUNCION INSERTAR
    @PostMapping
    @CrossOrigin(origins="http://localhost:4200/")
    public void insertar(@RequestBody Ordenador ordenador){
        ordenadorRepository.insertar(ordenador);
    }

    //FUNCIONES BORRAR 
    @DeleteMapping("/numeroSerie/{nserie}")
    @CrossOrigin(origins="http://localhost:4200")
    public void borrar(@PathVariable double nserie){
        ordenadorRepository.borrar(new Ordenador (nserie));
    }
    
    @DeleteMapping
    @CrossOrigin(origins = "http://localhost:4200/borrar")
    public List<Ordenador> borrartodos() {

        return ordenadorRepository.borrartodos();

    }
}

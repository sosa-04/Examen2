package hn.unah.lenguajes1900.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen.Entities.Direccion;
import hn.unah.lenguajes1900.examen.Services.impl.DireccionServiceImpl;

@RestController
@RequestMapping("/api")
public class DireccionController {
    
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/direccion/crear/{dni}")
    public Direccion crearDireccion(@RequestBody Direccion direccion, @PathVariable String dni){
        return this. direccionServiceImpl.crerarDireccion(direccion, dni);
    }
}

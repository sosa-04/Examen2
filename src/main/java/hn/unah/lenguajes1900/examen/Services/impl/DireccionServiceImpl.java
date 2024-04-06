package hn.unah.lenguajes1900.examen.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes1900.examen.Entities.Cliente;
import hn.unah.lenguajes1900.examen.Entities.Direccion;
import hn.unah.lenguajes1900.examen.Repositories.ClienteRepository;
import hn.unah.lenguajes1900.examen.Repositories.DereccionRepository;
import hn.unah.lenguajes1900.examen.Services.DireccionService;

public class DireccionServiceImpl implements DireccionService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private DereccionRepository direccionRepository;

    @Override
    public Direccion crerarDireccion(Direccion direccion, String dni) {
        if (this.clienteRepository.existsById(dni)) {
            Cliente cliente1 = this.clienteRepository.findById(dni).get();

            direccion.setCliente(cliente1);

            return this.direccionRepository.save(direccion);
        }
        return null;
    }
    
}

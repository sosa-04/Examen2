package hn.unah.lenguajes1900.examen.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes1900.examen.Entities.Cliente;
import hn.unah.lenguajes1900.examen.Repositories.ClienteRepository;
import hn.unah.lenguajes1900.examen.Services.ClienteService;

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        if (this.clienteRepository.existsById(cliente.getDni())) {
            return null;
        }

        return this.clienteRepository.save(cliente);
    }
    
}

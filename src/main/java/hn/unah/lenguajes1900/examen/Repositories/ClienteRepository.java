package hn.unah.lenguajes1900.examen.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.examen.Entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {
    
}

package hn.unah.lenguajes1900.examen.Services.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes1900.examen.Entities.Cuentas;
import hn.unah.lenguajes1900.examen.Repositories.ClienteRepository;
import hn.unah.lenguajes1900.examen.Repositories.CuentasRepository;
import hn.unah.lenguajes1900.examen.Services.CuentasService;

public class CuentasServiceImpl implements CuentasService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public Cuentas crearCuentas(Cuentas cuentas) {
        if (this.cuentasRepository.existsById(cuentas.getNumeroCuenta())) {
            if ((cuentas.getFechaApertura()!=(LocalDate.now())) || (cuentas.getEstado()!=1) ||(cuentas.getSaldo()<500) ) {
                return null;
            }
        }

        return this.cuentasRepository.save(cuentas);
    }

    @Override
    public Cuentas agregarCuentaCliente(String dni, String numeroCuenta) {

        if (this.clienteRepository.existsById(dni) && this.cuentasRepository.existsById(numeroCuenta)) {
            Cuentas cuenta1 = this.cuentasRepository.findById(numeroCuenta).get();

            if (cuenta1.getCliente().equals(null)) {
                cuenta1.setCliente(this.clienteRepository.findById(dni).get());
                return this.cuentasRepository.save(cuenta1);
            }
        }
        return null;
    }
    
}

package hn.unah.lenguajes1900.examen.Services;

import hn.unah.lenguajes1900.examen.Entities.Cuentas;

public interface CuentasService {
    
    public Cuentas crearCuentas(Cuentas cuentas);

    public Cuentas agregarCuentaCliente(String dni, String numeroCuenta);
}

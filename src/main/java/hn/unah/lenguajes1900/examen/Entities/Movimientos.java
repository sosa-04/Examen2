package hn.unah.lenguajes1900.examen.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {
    
    @Id
    @Column(name = "idmovimiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimiento;

    @Column(name = "tipomovimiento")
    private char tipoMovimiento;

    private double monto;

    @Column(name = "fechamovimiento")
    private LocalDate fechaMovimiento;

    @ManyToOne
    @JoinColumn(name = "numerocuenta", referencedColumnName = "numerocuenta")
    private Cuentas cuentas;
}

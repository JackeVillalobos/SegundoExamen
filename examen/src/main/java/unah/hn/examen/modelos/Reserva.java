package unah.hn.examen.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Reserva {

    @Id
    @Column(name = "idreserva")
    private int idReserva;

    @Column(name = "idcliente")
    private int idCliente;

    @Column(name = "idvehiculo")
    private int idVehiculo;

    private Date fecha;

    private int dias;

    private double total;

}

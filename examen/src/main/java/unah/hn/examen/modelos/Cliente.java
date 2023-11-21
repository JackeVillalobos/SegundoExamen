package unah.hn.examen.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    @Id
    @Column(name = "codigocliente")
    private int codigoCliente;

    private String nombre;

    private String apellido;

    private Date fechaingreso;

    @ManyToOne
    private TipoCliente tipoCliente;

}

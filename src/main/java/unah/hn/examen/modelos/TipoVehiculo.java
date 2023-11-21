package unah.hn.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoVehiculo {

    @Id
    @Column(name = "idtipovehiculo")
    private int idTipoVehiculo;

    private String descripcion;

    private double precioxhora;

    @OneToMany
    private Vehiculo vehiculo;
}

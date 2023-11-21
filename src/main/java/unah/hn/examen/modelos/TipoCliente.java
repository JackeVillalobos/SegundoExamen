package unah.hn.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipocliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCliente {

    @Id
    @Column(name = "idtipocliente")
    private int idTipoCliente;

    private String descripcion;

    @OneToMany
    private Cliente cliente;

}

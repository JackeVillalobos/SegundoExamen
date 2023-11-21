package unah.hn.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.examen.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

}

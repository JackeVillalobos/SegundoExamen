package unah.hn.examen.servicios;

import java.util.List;

import unah.hn.examen.modelos.Cliente;

public interface ClienteService {

    public Cliente guardarCliente(Cliente cliente);

    public List<Cliente> obtenerTodos();

    public List<Cliente> obtenerporid(Cliente codigoCliente);

    public String actualizarCliente(String dni, Cliente cliente);

}

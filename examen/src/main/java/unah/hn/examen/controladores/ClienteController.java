package unah.hn.examen.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.examen.modelos.Cliente;
import unah.hn.examen.servicios.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente nvoCliente) {
        if (nhvoCliente.gettipoCliente() != null) {
            nvoCliente.getTipoCliente().setCliente(nvoCliente);
        }
        return tis.clienteServiceImpl.guardarCliente(nvoCliente);
    }

    @GetMapping("/todos")
    public List<Clientes> obtenerTodos() {
        return this.clienteServiceImpl.obtenerTodos();
    }

    @DeleteMapping("/eliminar/{dni}")
    public String eliminarCliente(@PathVariable(name = "dni") String dni) {
        return this.clienteServiceImpl.eliminarCliente(dni);
    }

    @PutMapping("/actualizar")
    public String actualizarCliente(@RequestParam(name = "dni") String dni,
            @RequestBody Clientes cliente) {
        return this.clienteServiceImpl.actualizarCliente(dni, cliente);
    }

}

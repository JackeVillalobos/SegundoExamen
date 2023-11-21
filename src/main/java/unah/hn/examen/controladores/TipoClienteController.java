package unah.hn.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.examen.modelos.TipoCliente;
import unah.hn.examen.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("api/tipoCliente")

public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente creartipo(@RequestParam TipoCliente tipoCliente) {
        return tipoCliente;
    }

}

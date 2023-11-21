package unah.hn.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.examen.modelos.TipoCliente;
import unah.hn.examen.modelos.TipoVehiculo;
import unah.hn.examen.servicios.impl.TipoClienteServiceImpl;
import unah.hn.examen.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehi")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo creartipo(@RequestParam TipoVehiculo tipoVehiculo) {
        return tipoVehiculo;
    }
}

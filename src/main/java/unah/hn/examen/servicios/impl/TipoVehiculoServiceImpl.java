package unah.hn.examen.servicios.impl;

import org.springframework.stereotype.Service;

import unah.hn.examen.modelos.TipoVehiculo;
import unah.hn.examen.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Override
    public TipoVehiculo creartipo(String descripcion) {
        // TODO Auto-generated method stub
       eturn tipoVehiculoRep rository.save(descripcion);
    }

}

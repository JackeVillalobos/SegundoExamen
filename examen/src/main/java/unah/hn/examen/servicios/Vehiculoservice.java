package unah.hn.examen.servicios;

import java.util.List;

import unah.hn.examen.modelos.Vehiculo;

public interface Vehiculoservice {

    public Vehiculo guardarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodos();

    public List<Vehiculo> obtenerporid(Vehiculo idVehiculo);

}

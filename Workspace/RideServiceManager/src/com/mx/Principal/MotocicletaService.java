package com.mx.Principal;

import java.util.List;

import com.mx.Entidad.Motocicleta;
import com.mx.Entidad.Servicio;

public interface MotocicletaService {
	void crearMotocicleta(Motocicleta m);
    List<Motocicleta> listarMotocicletas();
    Motocicleta buscarMotocicleta(Integer id);
    void actualizarMotocicleta(Integer id, Motocicleta nuevaInfo);
    void eliminarMotocicleta(Integer id);
    void agregarServicio(Integer id, Servicio s);
    List<Servicio> verHistorialServicios(Integer id);
    double calcularGastoTotal(Integer id);
    
    void actualizarServicio(int idMoto, int indiceServicio, Servicio servicioActualizado);

}

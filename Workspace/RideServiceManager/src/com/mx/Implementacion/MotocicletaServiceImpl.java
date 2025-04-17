package com.mx.Implementacion;

import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Motocicleta;
import com.mx.Entidad.Servicio;
import com.mx.Principal.MotocicletaService;

public class MotocicletaServiceImpl implements MotocicletaService{
	
	protected List<Motocicleta> lista = new ArrayList<>();

	@Override
    public void crearMotocicleta(Motocicleta m) {
        lista.add(m);
    }

    @Override
    public List<Motocicleta> listarMotocicletas() {
        return lista;
    }

    @Override
    public Motocicleta buscarMotocicleta(Integer id) {
        return lista.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

//    @Override
//    public void actualizarMotocicleta(Integer id, Motocicleta nuevaInfo) {
//        Motocicleta moto = buscarMotocicleta(id);
//        if (moto != null) {
//            moto.setMarca(nuevaInfo.getMarca());
//            moto.setModelo(nuevaInfo.getModelo());
//            moto.setAnio(nuevaInfo.getAnio());
//        }
//    }
    
    @Override
    public void actualizarMotocicleta(Integer id, Motocicleta nuevaInfo) {
        Motocicleta moto = buscarMotocicleta(id);
        if (moto != null) {
            moto.setMarca(nuevaInfo.getMarca());
            moto.setModelo(nuevaInfo.getModelo());
            moto.setAnio(nuevaInfo.getAnio());
//            System.out.println("Motocicleta actualizada exitosamente.");
        } else {
            System.out.println("Error: La motocicleta con ID " + id + " no existe.");
        }
    }

    @Override
    public void eliminarMotocicleta(Integer id) {
        lista.removeIf(m -> m.getId() == id);
    }

    @Override
    public void agregarServicio(Integer id, Servicio s) {
        Motocicleta moto = buscarMotocicleta(id);
        if (moto != null) {
            moto.getHistorialServicios().add(s);
        }
    }

    @Override
    public List<Servicio> verHistorialServicios(Integer id) {
        Motocicleta moto = buscarMotocicleta(id);
        return moto != null ? moto.getHistorialServicios() : new ArrayList<>();
    }

    @Override
    public double calcularGastoTotal(Integer id) {
        return verHistorialServicios(id).stream().mapToDouble(Servicio::getCosto).sum();
    }

    @Override
    public void actualizarServicio(int idMoto, int indiceServicio, Servicio servicioActualizado) {
        Motocicleta moto = buscarMotocicleta(idMoto);
        if (moto != null && indiceServicio >= 0 && indiceServicio < moto.getHistorialServicios().size()) {
            moto.getHistorialServicios().set(indiceServicio, servicioActualizado);
        } else {
            System.out.println("Error: No se pudo actualizar el servicio. Verifique el ID y el índice del servicio.");
        }
    }
}

package com.rami.ecommerce.tarea;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TareaService {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }

    public Tarea guardarTarea(Tarea tarea) {
        tarea.setCompletada(false); // Asegura que la tarea se guarde como no completada por defecto
        return tareaRepository.save(tarea);
    }

    public Tarea obtenerTareaPorId(Long id) {
        return tareaRepository
                .findById(id)
                .orElse(null);
    }

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}

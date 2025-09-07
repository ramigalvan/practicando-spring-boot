package com.rami.ecommerce.tarea;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    //TODO: Aquí puedes definir métodos personalizados si es necesario
}

package com.rami.ecommerce.tarea;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
@RequestMapping("/")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }


    @GetMapping
    public String listaString(Model model) {
        model.addAttribute("tareas", tareaService.obtenerTodasLasTareas());
        return "index";
    }

    @PostMapping("/tareas")
    public String guardar(@ModelAttribute Tarea tarea) {
        tareaService.guardarTarea(tarea);
        return "redirect:/";
    }
      
    
}

package com.prueba1.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba1.v1.model.Teacher;
import com.prueba1.v1.model.User;
import com.prueba1.v1.repository.TeacherRepository;
import com.prueba1.v1.repository.UserRepository;

@Controller
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private UserRepository userRepository;

    // 1. CAMBIADO A LA RUTA EN INGLÉS QUE INTENTASTE BUSCAR
    @GetMapping("/admin/teachers/register")
    public String mostrarFormulario(Model model) {
        model.addAttribute("docente", new Teacher());
        
        List<User> disponibles = userRepository.findByUserAssignedFalse();
        model.addAttribute("usuariosDisponibles", disponibles);
        
        return "registro-docente"; // Sigue buscando 'registro-docente.html' en templates
    }

    // 2. CAMBIADO TAMBIÉN EL POST PARA MANTENER LA COHERENCIA
    @PostMapping("/admin/teachers/save")
    public String guardarDocente(@ModelAttribute("docente") Teacher teacher) {
        teacherRepository.save(teacher);
        
        if (teacher.getUserId() != null) {
            userRepository.findById(teacher.getUserId().longValue()).ifPresent(u -> {
                u.setUserAssigned(true);
                userRepository.save(u);
            });
        }
        
        return "redirect:/admin/teachers/register?exito";
    }
}
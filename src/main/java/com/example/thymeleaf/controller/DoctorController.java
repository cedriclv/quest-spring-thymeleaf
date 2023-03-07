package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(@RequestParam(required = false, defaultValue = "0") int number,
            @RequestParam(required = false, defaultValue = "John Smith") String name, Model model) {
        // model.addAttribute("name", "toto");
        model.addAttribute("doctorname", name);
        model.addAttribute("doctornumber", number);
        return "doctor";
    }
}
// Ton projet affiche bien le nom et le numéro du docteur correspondant aux
// liens

// Si aucun nom ni numéro n'est renseigné, l'affichage doit être "John Smith" et
// 0

// Les templates index.html et doctor.html doivent appeler les deux fragments
// fragments/header.html
// et fragments/footer.html
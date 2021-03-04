package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.Data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
        model.addAttribute("Planets", Planets.values());
        return "index";
    }
}

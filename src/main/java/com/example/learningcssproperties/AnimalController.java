package com.example.learningcssproperties;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {

    @GetMapping("/")  // Mapping for the index (home) page
    public String index() {
        return "index";  // Thymeleaf will resolve to index.html in the templates folder
    }

    @GetMapping("/nakedMoleRatDetails")
    public String nakedMoleRatDetails() {
        return "nakedMoleRatDetails"; // Thymeleaf will resolve to nakedMoleRatDetails.html
    }

    @GetMapping("/smoolmonkeyDetails")
    public String smoolmonkeyDetails() {
        return "smoolmonkeyDetails";
    }

    @GetMapping("/bigmanDetails")
    public String bigmanDetails() {
        return "bigmanDetails";
    }

    @GetMapping("/uglyfishDetails")
    public String uglyfishDetails() {
        return "uglyfishDetails";
    }

    @GetMapping("/uglymouseDetails")
    public String uglymouseDetails() {
        return "uglymouseDetails";
    }
}


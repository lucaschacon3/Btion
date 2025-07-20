package agency.btion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "servicios";
    }

    @GetMapping("/testimonios")
    public String testimonios() {
        return "testimonios";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/tarifas")
    public String tarifas() {
        return "tarifas";
    }

    @GetMapping("/btionai")
    public String btionai() {
        return "btionai";
    }

    @GetMapping("/privacidad")
    public String privacidad() {
        return "privacidad";
    }
}

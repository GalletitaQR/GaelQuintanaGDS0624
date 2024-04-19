package mx.utng.s20.hello.controler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.utng.s20.hello.model.Saludo;
@RestController
public class SaludoControler {
    @GetMapping("/saludo")
    public Saludo saludar() {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hello world!!");
        return saludo;
    }
}

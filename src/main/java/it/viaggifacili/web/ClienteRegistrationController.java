package it.viaggifacili.web;

import it.viaggifacili.model.Cliente;
import it.viaggifacili.service.ClienteService;
import it.viaggifacili.web.dto.ClienteRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class ClienteRegistrationController {

    private ClienteService clienteService;

    private ClienteRegistrationController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @ModelAttribute("cliente")
    public ClienteRegistrationDto clienteRegistrationDto() {
        System.out.println("BBBB");
        ClienteRegistrationDto registrationDto = new ClienteRegistrationDto();
        System.out.println(registrationDto.getCognome());
        return registrationDto;
    }

    @GetMapping
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("cliente") ClienteRegistrationDto registrationDto) {
        System.out.println("AAAA");
        clienteService.save(registrationDto);
        return "redirect:/register?success";
    }
}

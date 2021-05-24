package it.viaggifacili.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.ModelAttribute;

@Getter
public class ClienteRegistrationDto {
    private String nome, cognome, email, password;

    public ClienteRegistrationDto(String nome, String cognome, String email, String password) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
    }

    public ClienteRegistrationDto() { }
}

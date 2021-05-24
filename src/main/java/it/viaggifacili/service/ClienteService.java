package it.viaggifacili.service;

import it.viaggifacili.model.Cliente;
import it.viaggifacili.web.dto.ClienteRegistrationDto;

public interface ClienteService {

    public Cliente save(ClienteRegistrationDto registrationDto);
}

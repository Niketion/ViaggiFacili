package it.viaggifacili.service;

import it.viaggifacili.model.Cliente;
import it.viaggifacili.repository.ClienteRepository;
import it.viaggifacili.web.dto.ClienteRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        super();
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente save(ClienteRegistrationDto registrationDto) {
        Cliente cliente = new Cliente(
                registrationDto.getNome(),
                registrationDto.getCognome(),
                registrationDto.getPassword(),
                registrationDto.getEmail()
        );
        return clienteRepository.save(cliente);
    }
}

package it.viaggifacili.service;

import it.viaggifacili.model.User;
import it.viaggifacili.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}

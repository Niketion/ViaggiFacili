package it.viaggifacili.service;

import it.viaggifacili.model.Review;
import it.viaggifacili.model.User;
import it.viaggifacili.repository.UserRepository;
import it.viaggifacili.web.dto.UserRegistrationDto;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(
				registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				passwordEncoder.encode(registrationDto.getPassword()));

		Review exampleReview = new Review(
				user.getId(),
				"50399220859",
				5,
				"Servizio eccellente!",
				"Amo la pizza di pino's pizza!"
				);
		exampleReview.setIdUser(user.getId());

		user.setReviews(Collections.singletonList(exampleReview));
		return userRepository.save(user);
	}

	@Override
	@Nullable
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Password o email invalide");
		}

		return null;
	}

}

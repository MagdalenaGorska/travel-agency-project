package pl.sda.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.model.entity.Role;
import pl.sda.model.entity.User;
import pl.sda.repository.RoleRepository;
import pl.sda.repository.UserRepository;
import pl.sda.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        final Role roleUser = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(roleUser));
        userRepository.save(user);
    }
}

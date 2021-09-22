package pl.sda.service;

import pl.sda.model.entity.User;

public interface UserService {

    boolean existsByUsername(String username);

    void save(User user);

}


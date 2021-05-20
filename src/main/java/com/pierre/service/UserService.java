package com.pierre.service;

import com.pierre.dto.UserDTO;
import com.pierre.entities.User;
import com.pierre.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insert(User obj) {
        return userRepository.insert(obj);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getNome(), objDto.getDataNascimento(), objDto.getCep(), objDto.getDocument());
    }

}

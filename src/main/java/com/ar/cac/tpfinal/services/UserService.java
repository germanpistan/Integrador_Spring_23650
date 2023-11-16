package com.ar.cac.tpfinal.services;


import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.mappers.UserMapper;
import com.ar.cac.tpfinal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public UserService (UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getUsers() {
        List<User> users = repository.findAll();
        return users;
    }

    @GetMapping(value = "/users/{id}")    //se pone con llaves el id xq va a ser una variable, le puedo poner el numero de id que necesite
    public User getUserById(Long id){
        User user = repository.findById(id).get();  //con el .get, obtengo la entidad y si no la encuentra, me devuelve un null
        return user;
    }

    public UserDto createUser (UserDto user) {
        User entity = UserMapper.dtoToUser(user);
        User entitySaved = repository.save(entity);
        user = UserMapper.userToDto(entitySaved);
        user.setPassword("******");
        return user;

    }





    }


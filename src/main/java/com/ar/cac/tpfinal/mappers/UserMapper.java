package com.ar.cac.tpfinal.mappers;


import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;

import java.time.LocalDateTime;

public class UserMapper {
    public User dtoToUser (UserDto dto) {
        User user = new User();
        user.setUsername((dto.getUsername()));
        user.setPassword((dto.getPassword()));
        user.setAdress(dto.getAdress());
        user.setDni(dto.getDni);
        user.setEmail(dto.getEmail());
        user.setBirthday_date(dto.getBirthday);
        user.setCreated_at(LocalDateTime.now());
        user.setUpdated_at(LocalDateTime.now());
        return user;
    }

    public UserDto userToDto (User user) {
        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setDni(user.getDni());
        dto.setAddress(user.getAddress());
        dto.setEmail(user.getEmail());
        dto.setBirthday_date(user.getBirthday);
        dto.setCreated_at(user.getCreatedAt());
        dto.setUpdated_at(user.getUpdatedAt());
        return dto;
    }
}

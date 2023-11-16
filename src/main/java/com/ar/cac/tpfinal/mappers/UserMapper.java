package com.ar.cac.tpfinal.mappers;


import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;

import java.time.LocalDateTime;

public class UserMapper {
    public static User dtoToUser (UserDto dto) {
        User user = new User();
        user.setUsername((dto.getUsername()));
        user.setPassword((dto.getPassword()));
        user.setAddress((dto.getAddress()));
        user.setDni(dto.getDni());
        user.setEmail(dto.getEmail());
        user.setBirthday_date(dto.getBirthday_date());
        user.setCreated_at(LocalDateTime.now());
        user.setUpdated_at(LocalDateTime.now());
        return user;
    }

    public static UserDto userToDto (User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setDni(user.getDni());
        dto.setAddress(user.getAddress());
        dto.setEmail(user.getEmail());
        dto.setBirthday_date(user.getBirthday_date());
        dto.setCreated_at(user.getCreated_at());
        dto.setUpdated_at(user.getUpdated_at());
        return dto;
    }
}

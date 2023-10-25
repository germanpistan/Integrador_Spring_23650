package com.ar.cac.tpfinal.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter  //para ahorrarme hacer los getters y setters
@AllArgsConstructor   //para constructor implicito
public class UserDto {
    private String username;

    private String password;


    public UserDto() {

    }
}

package com.ar.cac.tpfinal.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter  //para ahorrarme hacer los getters y setters
@AllArgsConstructor
@NoArgsConstructor //para constructor implicito
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String dni;
    private String address;
    private Date birthday_date;
    private String email;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

}

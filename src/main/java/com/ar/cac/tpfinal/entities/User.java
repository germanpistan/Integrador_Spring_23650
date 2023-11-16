package com.ar.cac.tpfinal.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
//nombres de tablas en minuscula y plural
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "usuario")
    private String username;

    @Column( name = "contrasena")
    private String password;

    private String email;

    private String dni;

    @Column (name = "direccion")
    private String address;

    @Column (name ="fecha_cumpleanios")
    private Date birthday_date;

    //fecha de creacion y modificacion (estado) de cada usuario
    // TODO REFACTOR
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    //TODO REFACTOR
    //private List<Account> accounts;

}

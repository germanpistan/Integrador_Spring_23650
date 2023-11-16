package com.ar.cac.tpfinal.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
//nombres de tablas en minuscula y plural
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "usuario")
    private String username;

    @Column( name = "contrasena")
    private String password;
    private int dni;


    private String email;
    @Column (name = "direccion")
    private String adress;
    @Column (name ="fecha_cumpleanios")
    private Date birthday_date;

    //fecha de creacion y modificacion (estado) de casa usuario
    // TODO REFACTOR
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    //TO DO REFACTOR
    //private List<Account> accountList;


}

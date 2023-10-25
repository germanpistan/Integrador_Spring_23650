package com.ar.cac.tpfinal.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
//nombres de tablas en minuscula y plural
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;


    @Column (name = "usuario")
    private String username;

    @Column( name = "contrasena")
    private String password;

}

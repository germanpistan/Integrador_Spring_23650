package com.ar.cac.tpfinal.controllers;


import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")  //es para agregar el /api en la request
public class UserController {
    //Inyeccion de dependencias: otorgar al framework la creacion y asignacion de un bean o objeto especial a una clase que necesita eso. controller, service y repository
    //Por cada metodo/accion HTTP que quiera permitir
    //voy a tener al menos un metodo en mi controlador, especifico para esa accion

    //METODOS HTTP PERMITIDOS:
    // POST, GET (2 all y por cada user), PUT, PATCH, DELETE

    //ESTRUCTURA DE DATOS NUEVA para REST: ResponseEntity


    //necesito obtener una instancia del servicio de usuarios
    @Autowired   //con esta anotacion el framework ya se encargo de crear una instancia de esta clase y setearla dentro de la variable service
    private UserService service;



    //obtener una lista de usuarios registrados
    @GetMapping(value = "/users")  //esto es para que especificamente se ejecute ese metodo cuando pongo /api/users
    public ResponseEntity <List<User>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getUsers());
    }

    //Path variable es la ultima parte del endpoint que es variable
    //obtener la informacion de un solo usuario
    @GetMapping(value = "/users/{id}")    //se pone con llaves el id xq va a ser una variable, le puedo poner el numero de id que necesite
    public ResponseEntity <User> getUserById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getUserById(id));
    }

    //crear o registrar un usuario
    @PostMapping (value = "/users")
    public ResponseEntity <UserDto> createUser (@RequestBody UserDto user){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(user));
    }

    //modificar TOTALMENTE un usuario  (PUT)

    public String updateUser(){
        return "";
    }

    //modificar PARCIALMENTE un usuario (PATCH)
    public String updateParcialUser(){
        return "";
    }


    //eliminar un usuario



}

package com.microservices.pet.application.controllers.contracts;

import com.microservices.pet.domain.models.dto.UsuarioDto;
import com.microservices.pet.domain.models.requests.CreateUserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthController {

    @PostMapping(path = "/login")
    ResponseEntity<UsuarioDto> login();

    @PostMapping(path = "/register")
    ResponseEntity<UsuarioDto> register(@RequestBody CreateUserRequest createUserRequest);

}

package com.lsiccha.pet.application.controllers.contracts;

import com.lsiccha.pet.application.dto.UsuarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;@

public interface AuthController {

    @PostMapping(path = "/login")
    ResponseEntity<UsuarioDto> login();

    @PostMapping(path = "/register")
    ResponseEntity<UsuarioDto> register();

}

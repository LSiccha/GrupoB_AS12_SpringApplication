package com.lsiccha.pet.application.controllers.impl;

import com.lsiccha.pet.application.controllers.contracts.AuthController;
import com.lsiccha.pet.domain.mappers.UsuarioMapper;
import com.lsiccha.pet.domain.models.dto.UsuarioDto;
import com.lsiccha.pet.domain.models.entities.Usuario;
import com.lsiccha.pet.domain.models.requests.CreateUserRequest;
import com.lsiccha.pet.domain.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "auth")
@AllArgsConstructor
public class AuthControllerImpl implements AuthController {

    private AuthService authService;

    @Override
    public ResponseEntity<UsuarioDto> login() {
        return null;
    }

    @Override
    public ResponseEntity<UsuarioDto> register(CreateUserRequest createUserRequest) {

        Usuario usuario = this.authService.registerUser(createUserRequest);
        UsuarioDto usuarioDto = UsuarioMapper.INSTANCE.usuarioToUsuarioDto(usuario);

        return new ResponseEntity<>(usuarioDto, HttpStatus.OK);
    }
}

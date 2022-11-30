package com.lsiccha.pet.domain.services.impl;

import com.lsiccha.pet.domain.models.entities.Adoptante;
import com.lsiccha.pet.domain.models.entities.Usuario;
import com.lsiccha.pet.domain.models.requests.CreateUserRequest;
import com.lsiccha.pet.domain.models.requests.LoginRequest;
import com.lsiccha.pet.domain.repositories.AdminRepository;
import com.lsiccha.pet.domain.repositories.AdoptanteRepository;
import com.lsiccha.pet.domain.repositories.UsuarioRepository;
import com.lsiccha.pet.domain.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private UsuarioRepository usuarioRepository;
    private AdoptanteRepository adoptanteRepository;
    private AdminRepository adminRepository;

    @Override
    public Usuario registerUser(CreateUserRequest createUserRequest) {
        Usuario toSave = new Usuario();

        toSave.setEmail(createUserRequest.getEmail());
        toSave.setPassword(createUserRequest.getPassword());

        Usuario savedToDb = this.usuarioRepository.save(toSave);

        Adoptante adoptanteToSave = new Adoptante();
        adoptanteToSave.setUsuario(savedToDb);
        adoptanteToSave.setFechaRegistro(LocalDate.now());

        Adoptante savedAdoptante = this.adoptanteRepository.save(adoptanteToSave);

        return savedToDb;
    }

    @Override
    public Usuario login(LoginRequest loginRequest) {
        return null;
    }
}

package com.lsiccha.pet.domain.services;

import com.lsiccha.pet.domain.models.entities.Usuario;
import com.lsiccha.pet.domain.models.requests.CreateUserRequest;
import com.lsiccha.pet.domain.models.requests.LoginRequest;

public interface AuthService {
    Usuario registerUser(CreateUserRequest createUserRequest);
    Usuario login(LoginRequest loginRequest);
}

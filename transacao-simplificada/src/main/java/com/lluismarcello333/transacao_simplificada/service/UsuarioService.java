package com.lluismarcello333.transacao_simplificada.service;

import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Usuario;
import com.lluismarcello333.transacao_simplificada.infrastructure.exceptions.UserNotFound;
import com.lluismarcello333.transacao_simplificada.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario buscarUsuario(Long id){
        return repository.findById(id)
                .orElseThrow(() ->
                        new UserNotFound("Usuario não encontrado"));
    }

}

package com.lluismarcello333.transacao_simplificada.service;

import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Carteira;
import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Usuario;
import com.lluismarcello333.transacao_simplificada.infrastructure.exceptions.UserNotFound;
import com.lluismarcello333.transacao_simplificada.infrastructure.repository.CarteiraRepository;
import com.lluismarcello333.transacao_simplificada.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CarteiraService {

    private final CarteiraRepository repository;

    public void salvar(Carteira carteira){
        repository.save(carteira);
    }

}

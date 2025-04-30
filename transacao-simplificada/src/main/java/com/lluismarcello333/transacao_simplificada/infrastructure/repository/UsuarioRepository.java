package com.lluismarcello333.transacao_simplificada.infrastructure.repository;

import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

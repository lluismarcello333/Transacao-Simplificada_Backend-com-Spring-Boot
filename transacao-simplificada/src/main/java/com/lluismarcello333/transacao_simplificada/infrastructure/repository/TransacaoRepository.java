package com.lluismarcello333.transacao_simplificada.infrastructure.repository;

import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacoes, Long> {
}

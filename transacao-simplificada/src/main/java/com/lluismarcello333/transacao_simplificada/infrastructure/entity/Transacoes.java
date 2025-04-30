package com.lluismarcello333.transacao_simplificada.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "transacao")
@Table
@Builder
@Getter
@Setter
public class Transacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    @JoinColumn(name = "recebedor_id")
    @ManyToOne
    private Usuario recebedor;

    @JoinColumn(name = "pagador_id")
    @ManyToOne
    private Usuario pagador;
    private LocalDateTime dataHoraTransacao;

    @PrePersist
    void prePersist(){
        dataHoraTransacao = LocalDateTime.now();
    }
}

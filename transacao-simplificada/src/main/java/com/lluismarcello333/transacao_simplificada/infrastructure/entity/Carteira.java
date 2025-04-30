package com.lluismarcello333.transacao_simplificada.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "carteira")
@Table
@Data
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal saldo;

    @JoinColumn(name = "usuario_id")
    @OneToOne
    private Usuario usuario;
}

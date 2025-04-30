package com.lluismarcello333.transacao_simplificada.infrastructure.configs;

import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Carteira;
import com.lluismarcello333.transacao_simplificada.infrastructure.entity.TipoUsuario;
import com.lluismarcello333.transacao_simplificada.infrastructure.entity.Usuario;
import com.lluismarcello333.transacao_simplificada.infrastructure.repository.CarteiraRepository;
import com.lluismarcello333.transacao_simplificada.infrastructure.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class PopularTabelaUsuario {
    @Bean
    CommandLineRunner popularBanco(UsuarioRepository usuarioRepository, CarteiraRepository carteiraRepository){
        return args -> {
            if (usuarioRepository.count() == 0){
                BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

                Usuario usuario1 = new Usuario(null, "Carlos Silva", "carlos@email.com", "101111111111",
                        encoder.encode("123456"), null, TipoUsuario.COMUM);

                Usuario usuario2 = new Usuario(null, "Ana Souza", "anaSouza@email.com", "102222222222",
                        encoder.encode("123456"), null, TipoUsuario.COMUM);

                Usuario lojista = new Usuario(null, "Loja Exemplo", "cloja@email.com", "103333333333",
                        encoder.encode("123456"), null, TipoUsuario.LOJISTA);

                usuarioRepository.saveAll(List.of(usuario1, usuario2, lojista));

                Carteira carteira1 = new Carteira(null, new BigDecimal("1000.00"), usuario1);
                Carteira carteira2 = new Carteira(null, new BigDecimal("2000.00"), usuario2);
                Carteira carteira3 = new Carteira(null, new BigDecimal("5000.00"), lojista);

                carteiraRepository.saveAll(List.of(carteira1, carteira2, carteira3));

                System.out.println("Usuários e carteiras populados com sucesso!");
            }
        };
    }
}

package br.com.ifpe.oxefood_api_jessica.modelo.acesso;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    Optional<Usuario> findByUsername(String username);//select* from usuario where usernae = :?

}

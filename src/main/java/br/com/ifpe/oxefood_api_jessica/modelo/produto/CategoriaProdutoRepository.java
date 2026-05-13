package br.com.ifpe.oxefood_api_jessica.modelo.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Long> {
 

}

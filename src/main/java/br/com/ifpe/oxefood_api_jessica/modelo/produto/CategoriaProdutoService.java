package br.com.ifpe.oxefood_api_jessica.modelo.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CategoriaProdutoService {
    
   @Autowired
   private CategoriaProdutoRepository repository;

   @Transactional
   public CategoriaProduto save(CategoriaProduto categoria) {

      categoria.setHabilitado(Boolean.TRUE);
       return repository.save(categoria);
   }

      public List<CategoriaProduto> listarTodos() {
  
        return repository.findAll();
    }

    public CategoriaProduto obterPorID(Long id) {

        return repository.findById(id).get();
    }

           @Transactional
   public void update(Long id, CategoriaProduto categoriaAlterada) {

      CategoriaProduto categoria = repository.findById(id).get();
      categoria.setDescricao(categoriaAlterada.getDescricao());
	    
      repository.save(categoria);
  }

  
     @Transactional
   public void delete(Long id) {

       CategoriaProduto categoria = repository.findById(id).get();
       categoria.setHabilitado(Boolean.FALSE);

       repository.save(categoria);
   }
    
}


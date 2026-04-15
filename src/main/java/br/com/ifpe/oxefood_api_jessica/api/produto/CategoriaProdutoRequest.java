package br.com.ifpe.oxefood_api_jessica.api.produto;

import br.com.ifpe.oxefood_api_jessica.modelo.produto.CategoriaProduto;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {
    
    @NotNull(message = "A descrição é de preenchimento obrigatório")
    private String descricao;

    public CategoriaProduto build() {
     return CategoriaProduto.builder()
           .descricao(descricao)
           .build();
   }
}

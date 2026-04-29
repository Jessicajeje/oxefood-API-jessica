package br.com.ifpe.oxefood_api_jessica.api.produto;

import org.hibernate.validator.constraints.Length;

import br.com.ifpe.oxefood_api_jessica.modelo.produto.CategoriaProduto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {
    
    @Length(max = 200, message = "O Nome deverá ter no máximo {200} caracteres")
    private String descricao;

    public CategoriaProduto build() {
     return CategoriaProduto.builder()
           .descricao(descricao)
           .build();
   }
}

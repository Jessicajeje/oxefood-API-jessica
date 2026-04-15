package br.com.ifpe.oxefood_api_jessica.api.produto;

import org.hibernate.validator.constraints.Length;

import br.com.ifpe.oxefood_api_jessica.modelo.produto.Produto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {
    
   @NotNull(message = "Selecione uma categoria")
   private Long idCategoria;
   
   @Length(max = 100, message = "O código deverá ter no máximo {100} caracteres")
   private String codigo;

   @NotNull(message = "O título é de preenchimento obrigatório")
   @Length(max = 100, message = "O título deverá ter no máximo {100} caracteres")
   private String titulo;

   @NotNull(message = "A descrição é de preenchimento obrigatório")
   @NotEmpty(message = "A descrição é de preenchimento obrigatório")
   @Length(max = 200, message = "A descrição deverá ter no máximo {200} caracteres")
   private String descricao;


   @NotNull(message = "O valor unitário é de preenchimento obrigatório")
   @NotEmpty(message = "O valor unitário é de preenchimento obrigatório")
   @Length(max = 100, message = "O valor unitário deverá ter no máximo {100} caracteres")
   private Double valorUnitario;

   private Integer tempoEntregaMinimo;

   private Integer tempoEntregaMaximo;

   public Produto build() {

       return Produto.builder()
           .codigo(codigo)
           .titulo(titulo)
           .descricao(descricao)
           .valorUnitario(valorUnitario)
           .tempoEntregaMinimo(tempoEntregaMinimo)
           .tempoEntregaMaximo(tempoEntregaMaximo)
           .build();
   }
}

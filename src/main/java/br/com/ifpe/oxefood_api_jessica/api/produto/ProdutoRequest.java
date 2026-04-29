package br.com.ifpe.oxefood_api_jessica.api.produto;

import org.hibernate.validator.constraints.Length;

import br.com.ifpe.oxefood_api_jessica.modelo.produto.Produto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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

    private Long idCategoria;

    private String codigo;
    
    @NotNull(message = "O Nome é de preenchimento obrigatório")
    @NotEmpty(message = "O Nome é de preenchimento obrigatório")
    private String titulo;

    @Length(max = 200, message = "A descrição deverá ter no máximo {200} caracteres")
    private String descricao;

    @Min(value = 20, message = "O valor do produto não pode ser menor que 20")
    @Max(value = 100, message = "O valor do produto não pode ser maior que 100")
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

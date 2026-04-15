package br.com.ifpe.oxefood_api_jessica.api.entregador;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood_api_jessica.modelo.entregador.Entregador;
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
public class EntregadorRequest {
    
   @NotNull(message = "O Nome é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {100} caracteres")
   private String nome;

    @Length(max = 20, message = "O RG deverá ter no máximo {20} caracteres")
   private String rg;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;

   private String cpf;
   @NotNull(message = "O celular é de preenchimento obrigatório")
   @NotEmpty(message = "O celular é de preenchimento obrigatório")
   private String foneCelular;

   @NotNull(message = "O telefone fixo é de preenchimento obrigatório")
   @NotEmpty(message = "O telefone fixo é de preenchimento obrigatório")
   private String foneFixo;

   @NotNull(message = "as entregas realizadas são de preenchimento obrigatório")
   @NotEmpty(message = "O entregas realizadas são de preenchimento obrigatório")
   @Length(max = 30, message = "O Nome deverá ter no máximo {30} caracteres")
   private Integer qtdEntregasRealizadas;

   @NotNull(message = "O valor do frete é de preenchimento obrigatório")
   @NotEmpty(message = "O valor do frete é de preenchimento obrigatório")
   private Double valorFrete;

    @Length(max = 100, message = "A rua deverá ter no máximo {100} caracteres")
   private String enderecoRua;

    @Length(max = 200, message = "O complemento deverá ter no máximo {200} caracteres")
   private String enderecoComplemento;

    @Length(max = 100, message = "O número deverá ter no máximo {100} caracteres")
   private String enderecoNumero;

    @Length(max = 100, message = "O bairro deverá ter no máximo {100} caracteres")
   private String enderecoBairro;

    @Length(max = 100, message = "A cidade deverá ter no máximo {100} caracteres")
   private String enderecoCidade;

    @Length(max = 8, message = "O CEP deverá ter no máximo {8} caracteres")
   private String enderecoCep;

   private String enderecoUf;
   private Boolean ativo;

   public Entregador build() {

       return Entregador.builder()
           .nome(nome)
           .dataNascimento(dataNascimento)
           .cpf(cpf)
           .rg(rg)
           .foneCelular(foneCelular)
           .foneFixo(foneFixo)
           .qtdEntregasRealizadas(qtdEntregasRealizadas)
           .valorFrete(valorFrete)
           .enderecoRua(enderecoRua)
           .enderecoComplemento(enderecoComplemento)
           .enderecoNumero(enderecoNumero)
           .enderecoBairro(enderecoBairro)
           .enderecoCidade(enderecoCidade)
           .enderecoCep(enderecoCep)
           .enderecoUf(enderecoUf)
           .ativo(ativo)
           .build();
   }
}

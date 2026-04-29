package br.com.ifpe.oxefood_api_jessica.api.entregador;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood_api_jessica.modelo.entregador.Entregador;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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

   @NotNull(message = "O RG é de preenchimento obrigatório")
   @NotEmpty(message = "O RG é de preenchimento obrigatório")
   @Length(max = 8, message = "O RG deverá ter no máximo {8} caracteres")
   private String rg;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;

  @CPF
   private String cpf;

   @Pattern(regexp = "^81\\d{8,9}$", message = "O telefone deve começar com o prefixo 81 e ter 10 ou 11 dígitos")
   private String foneCelular;

   @Pattern(regexp = "^81\\d{8,9}$", message = "O telefone deve começar com o prefixo 81 e ter 10 ou 11 dígitos")
   private String foneFixo;

   private Integer qtdEntregasRealizadas;

   private Double valorFrete;

   private String enderecoRua;

   private String enderecoComplemento;

   private String enderecoNumero;

   private String enderecoBairro;

   private String enderecoCidade;

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

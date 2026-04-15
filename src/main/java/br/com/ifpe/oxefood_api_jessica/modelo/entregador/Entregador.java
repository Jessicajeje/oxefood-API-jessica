package br.com.ifpe.oxefood_api_jessica.modelo.entregador;

import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction;
import org.hibernate.validator.constraints.br.CPF;

import br.com.ifpe.oxefood_api_jessica.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Entregador")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregador extends EntidadeAuditavel {

   @Column(nullable = false, length = 100)
   private String nome;

    @Column(nullable = false, length = 20, unique = true)
   private String rg;

   @Column
   private LocalDate dataNascimento;

   @Column(unique = true, nullable = false)
   @CPF(message = "O CPF deve ser válido")
   private String cpf;

   @Column(nullable = false)
   private String foneCelular;

   @Column(nullable = false)
   private String foneFixo;

    @Column(nullable = false, length = 30)
   private Integer qtdEntregasRealizadas;

    @Column(nullable = false)
   private Double valorFrete;

    @Column(length = 100)
   private String enderecoRua;

    @Column(length = 200)
   private String enderecoComplemento;

    @Column(length = 100)
   private String enderecoNumero;

    @Column(length = 100)
   private String enderecoBairro;

    @Column(length = 100)
   private String enderecoCidade;

    @Column(length = 8)
   private String enderecoCep;

    @Column
   private String enderecoUf;

    @Column
   private Boolean ativo;

    
}

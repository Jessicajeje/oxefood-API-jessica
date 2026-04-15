package br.com.ifpe.oxefood_api_jessica.modelo.produto;

import org.hibernate.annotations.SQLRestriction;

import br.com.ifpe.oxefood_api_jessica.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Produto")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel {
    
   @ManyToOne
   @JoinColumn(name = "categoria_id")
   @Column(nullable = false, length = 100)
   private CategoriaProduto categoria;

   @Column
   private String codigo;

   @Column(nullable = false, length = 100)
   private String titulo;

   @Column(length = 200, nullable = false)
   private String descricao;

   @Column(length = 100, nullable = false)
   private Double valorUnitario;

   @Column
   private Integer tempoEntregaMinimo;

   @Column
   private Integer tempoEntregaMaximo;
}

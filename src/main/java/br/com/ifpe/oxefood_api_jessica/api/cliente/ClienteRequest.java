package br.com.ifpe.oxefood_api_jessica.api.cliente;

import java.time.LocalDate;
import java.util.Arrays;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood_api_jessica.modelo.acesso.Perfil;
import br.com.ifpe.oxefood_api_jessica.modelo.acesso.Usuario;
import br.com.ifpe.oxefood_api_jessica.modelo.cliente.Cliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public class ClienteRequest {

    @NotBlank(message = "O e-mail é de preenchimento obrigatório")
    @Email
    private String email;

    @NotBlank(message = "A senha é de preenchimento obrigatório")
    private String password;


   @NotNull(message = "O Nome é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {100} caracteres")
   private String nome;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;

   @CPF
   private String cpf;

   @Pattern(regexp = "^81\\d{8,9}$", message = "O telefone deve começar com o prefixo 81 e ter 10 ou 11 dígitos")
   private String foneCelular;

   @Pattern(regexp = "^81\\d{8,9}$", message = "O telefone deve começar com o prefixo 81 e ter 10 ou 11 dígitos")
   private String foneFixo;

       public Usuario buildUsuario() {
       return Usuario.builder()
           .username(email)
           .password(password)
           .roles(Arrays.asList(new Perfil(Perfil.ROLE_CLIENTE)))
           .build();
   }


   public Cliente build() {

       return Cliente.builder()
       .usuario(buildUsuario())
           .nome(nome)
           .dataNascimento(dataNascimento)
           .cpf(cpf)
           .foneCelular(foneCelular)
           .foneFixo(foneFixo)
           .build();
   }

    
}

package br.com.ifpe.oxefood_api_jessica.api.acesso;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder//não preisa mandar objeto para o service
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
    
}

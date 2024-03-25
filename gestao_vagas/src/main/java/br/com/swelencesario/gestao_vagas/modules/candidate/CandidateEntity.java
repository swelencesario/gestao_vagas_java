package br.com.swelencesario.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;

    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "Este campo necessita de um e-mail válido")
    private String email;

    @Length(min = 6, max = 24)
    private String password;
    private String description;
    private String curriculum;
}

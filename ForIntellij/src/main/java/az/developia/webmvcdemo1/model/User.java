package az.developia.webmvcdemo1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Pattern(regexp = "[a-z0-9A-z]")
    private String username;

    private String password;

}

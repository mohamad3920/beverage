package com.assignment.onlineShop.service.model;

import com.assignment.onlineShop.repository.entity.WebUser;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    @NotNull
    @Size(min = 8)
//    @Pattern(regexp = "[a-z]*", message = "username only contains at least 8 lower case letters")
    private String username;
    @NotNull
//    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
//            message = "at least 8 chars, containing digits, lower and upper case letters and special characters")
    private String password;
    @NotNull
    @NotEmpty
    private String fullName;
    private String phoneNumber;

    public WebUser toUser(PasswordEncoder passwordEncoder, String role) {
        return new WebUser(username, passwordEncoder.encode(password), fullName, phoneNumber, role);
    }
}

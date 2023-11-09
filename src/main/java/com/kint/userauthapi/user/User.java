package com.kint.userauthapi.user;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}

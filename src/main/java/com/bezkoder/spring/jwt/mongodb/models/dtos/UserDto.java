package com.bezkoder.spring.jwt.mongodb.models.dtos;

import com.bezkoder.spring.jwt.mongodb.models.Role;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
public class UserDto {
    private String id;

    private String username;

    private String email;

    private String password;

    private Set<Role> roles = new HashSet<>();

    public UserDto() {
    }

    public UserDto(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}

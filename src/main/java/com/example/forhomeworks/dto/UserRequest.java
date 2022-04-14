package com.example.forhomeworks.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    String userName;

    String email;

    String password;

    Long sentNumByEmail;
}

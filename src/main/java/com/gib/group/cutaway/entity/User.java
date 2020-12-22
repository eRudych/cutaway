package com.gib.group.cutaway.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 4887904943282174032L;

    private Long id;


    private String email;

    private String password;

    private String name;

    private String phone;

    private String address;

    private boolean active;

    private String role = "ROLE_CUSTOMER";

    @JsonIgnore
    private Cart cart;

}


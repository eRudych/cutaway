package com.gib.group.cutaway.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor

public class Cart implements Serializable {

    private long cartId;

    private User user;

    private Set<ProductInOrder> products = new HashSet<>();


    public Cart(User user) {
        this.user  = user;
    }

}

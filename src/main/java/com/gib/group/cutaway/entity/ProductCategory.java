package com.gib.group.cutaway.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class ProductCategory implements Serializable {

    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;


    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}

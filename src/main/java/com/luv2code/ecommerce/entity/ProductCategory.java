package com.luv2code.ecommerce.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
// @Data -- known bug
@Getter
@Setter
public class ProductCategory {
        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;

        @Column(name = "category_name")
        private  String categoryName;

        @OneToMany (cascade = CascadeType.ALL, mappedBy =  "category")
        private Set<Product> products;


}

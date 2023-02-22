package com.miniproject.hisserver.menu.model;


import com.miniproject.hisserver.common.BaseEntity;


import com.miniproject.hisserver.store.model.Store;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE menu SET deleted = true Where id = ?")
public class Menu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String img;

    private String category;

    private int price;

    private int amount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;
}

package com.miniproject.hisserver.menu.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.ordermenu.model.OrderMenu;
import com.miniproject.hisserver.store.model.Store;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;

    private int price;

    @OneToMany(mappedBy = "menu")
    @JsonManagedReference
    private List<OrderMenu> orderMenu = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;
}

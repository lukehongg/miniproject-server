package com.miniproject.hisserver.ordermenu.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.menu.model.Menu;
import com.miniproject.hisserver.order.model.Orders;
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
@SQLDelete(sql = "UPDATE order_menu SET deleted = true Where id = ?")
public class OrderMenu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String menuName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Menu menu;
}
